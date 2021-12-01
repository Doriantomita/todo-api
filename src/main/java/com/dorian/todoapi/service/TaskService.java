package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.TaskModel;

public interface TaskService {

    TaskModel findTaskModelByUuid(String uuid);

    TaskModel save(TaskModel taskModel);

    void deleteTask(String uuid);
}
