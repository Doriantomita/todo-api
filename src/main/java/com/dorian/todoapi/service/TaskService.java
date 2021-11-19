package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.TaskModel;

public interface TaskService {

    TaskModel save(TaskModel taskModel);

}
