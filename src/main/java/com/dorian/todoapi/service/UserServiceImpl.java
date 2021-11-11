package com.dorian.todoapi.service;

import com.dorian.todoapi.aspect.Loggable;
import com.dorian.todoapi.persistence.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    @Loggable
    public void doService() {
        log.info("userService");
    }
}
