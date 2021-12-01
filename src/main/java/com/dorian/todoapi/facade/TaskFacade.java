package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.CreateTaskDto;
import com.dorian.todoapi.controller.dto.DeleteTaskDto;
import com.dorian.todoapi.controller.dto.DisplayTaskDto;

/**
 * Layer that retrieves TaskModel instances
 * and converts them into DisplayTaskDto instances
 */

public interface TaskFacade {

    DisplayTaskDto createTask(String taskContainerUuid, CreateTaskDto createTaskDto);

    void deleteTask(DeleteTaskDto deleteTaskDto);
}
