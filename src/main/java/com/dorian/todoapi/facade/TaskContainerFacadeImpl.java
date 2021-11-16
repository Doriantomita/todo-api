package com.dorian.todoapi.facade;

import com.dorian.todoapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskContainerFacadeImpl implements TaskContainerFacade{

    @Autowired
    private TaskService taskService;

}
