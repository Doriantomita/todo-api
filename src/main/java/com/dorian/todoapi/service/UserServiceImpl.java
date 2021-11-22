package com.dorian.todoapi.service;

import com.dorian.todoapi.aspect.Loggable;
import com.dorian.todoapi.controller.dto.AuthenticationDto;
import com.dorian.todoapi.exception.InvalidCredentialException;
import com.dorian.todoapi.exception.NoSuchUserException;
import com.dorian.todoapi.persistence.model.UserModel;
import com.dorian.todoapi.persistence.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Log4j2
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    public static final String CREDENTIAL_MESSAGE = "User or password incorrect!";
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    @Override
    @Loggable
    public void doService() {
        log.info("userService");
    }

    @Override
    public UserModel saveUser(UserModel userToSave) {
        userToSave.setPassword(encoder.encode(userToSave.getPassword()));
        return userRepository.save(userToSave);
    }

    @Override
    public UserModel findUserByUsername(String username) {
        return userRepository.findUserModelByUsername(username).orElseThrow(() -> new NoSuchUserException(
                MessageFormat.format("User with username {0} not found", username)));
    }

    @Override
    public UserModel findUserByUuid(String uuid) {
        return userRepository.findUserModelByUuid(uuid).orElseThrow(() -> new NoSuchUserException(
                MessageFormat.format("User with uuid {0} not found", uuid)));
    }

    @Override
    public void checkCredentials(AuthenticationDto authenticationDto) {
        Optional<UserModel> userModel = userRepository.findUserModelByUsername(authenticationDto.getUsername());
        if (userModel.isEmpty()) {
            throw new InvalidCredentialException(CREDENTIAL_MESSAGE);
        } else {
            if (!encoder.matches(authenticationDto.getPassword(), userModel.get().getPassword())) {
                throw new InvalidCredentialException(CREDENTIAL_MESSAGE);
            }
        }

    }
}
