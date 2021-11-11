package com.dorian.todoapi.controller;

import com.dorian.todoapi.aspect.Loggable;
import com.dorian.todoapi.facade.UserFacade;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class UserController {

    @Autowired
    private UserFacade userFacade;


    @Loggable
    public void doControllerStuff() {
        log.info("userController");
        userFacade.doStuff();
    }
}
