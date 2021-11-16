package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.UserFacade;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class UserController {

    @Autowired
    private UserFacade userFacade;

}
