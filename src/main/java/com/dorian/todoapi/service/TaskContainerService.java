package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.TaskContainerModel;

public interface TaskContainerService {

    TaskContainerModel findTaskContainerByUuid(String uuid);

    TaskContainerModel save(TaskContainerModel taskContainerModel);

    void deleteTaskContainer(String uuid);
}
