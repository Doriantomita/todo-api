package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.TaskContainerFacade;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskContainerController {

    @Autowired
    private TaskContainerFacade taskContainerFacade;
}
