package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.CreateTaskContainerDto;
import com.dorian.todoapi.controller.dto.TaskContainerDto;

/**
 * Layer that retrieves TaskContainerModel instances
 * and converts them into TaskContainerDto instances
 */

public interface TaskContainerFacade {
    TaskContainerDto createTaskContainer(String parentBoardUuid, CreateTaskContainerDto createTaskContainerDto);
}
