package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.TaskFacade;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskController {

    @Autowired
    private TaskFacade taskFacade;
}
