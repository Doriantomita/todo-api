package com.dorian.todoapi.service;

import com.dorian.todoapi.aspect.Loggable;
import com.dorian.todoapi.persistence.model.UserModel;
import com.dorian.todoapi.persistence.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    @Loggable
    public void doService() {
        log.info("userService");
    }

    @Override
    public UserModel saveUser(UserModel userToSave) {
        return userRepository.save(userToSave);
    }

    @Override
    public UserModel findUserByUuid(String uuid) {
        return userRepository.findUserModelByUuid(uuid);
    }
}
