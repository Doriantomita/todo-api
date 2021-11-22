package com.dorian.todoapi.security;

import com.dorian.todoapi.exception.NoSuchUserException;
import com.dorian.todoapi.persistence.model.UserModel;
import com.dorian.todoapi.persistence.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserModel userModel = findUserIfExists(userRepository.findUserModelByUsername(s), s);
        String userName = userModel.getUsername();
        String password = userModel.getPassword();
        return new User(userName, password, Collections.emptyList());
    }

    private UserModel findUserIfExists(Optional<UserModel> userModel, String userName) {
        return userModel.orElseThrow(() ->
                new NoSuchUserException(MessageFormat.format("User {0} not found", userName)));
    }
}
