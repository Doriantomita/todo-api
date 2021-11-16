package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.TaskContainerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskContainerController {

    @Autowired
    private TaskContainerFacade taskContainerFacade;
}
