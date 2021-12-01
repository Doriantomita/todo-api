package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.CreateTaskDto;
import com.dorian.todoapi.controller.dto.DeleteTaskDto;
import com.dorian.todoapi.controller.dto.DisplayTaskDto;
import com.dorian.todoapi.persistence.model.TaskContainerModel;
import com.dorian.todoapi.persistence.model.TaskModel;
import com.dorian.todoapi.service.TaskContainerService;
import com.dorian.todoapi.service.TaskService;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
@AllArgsConstructor
public class TaskFacadeImpl implements TaskFacade{

    private final TaskService taskService;

    private final TaskContainerService taskContainerService;

    private final ModelMapper modelMapper;

    @Override
    public DisplayTaskDto createTask(String taskContainerUuid, CreateTaskDto createTaskDto) {
        TaskContainerModel taskContainerModel = taskContainerService.findTaskContainerByUuid(taskContainerUuid);
        TaskModel taskModel = modelMapper.map(createTaskDto, TaskModel.class);
        taskModel.setUuid(UUID.randomUUID().toString());
        taskModel.setDescription(StringUtils.EMPTY);
        taskModel.setSteps(Collections.emptyList());
        taskModel.setComments(Collections.emptyList());
        taskModel.setAssignedUsers(Collections.emptyList());
        taskModel.setParentContainer(taskContainerModel);
        taskContainerModel.getTasks().add(taskModel);
        taskContainerService.save(taskContainerModel);
        return modelMapper.map(taskService.save(taskModel), DisplayTaskDto.class);
    }

    @Override
    public void deleteTask(DeleteTaskDto deleteTaskDto) {
        taskService.deleteTask(deleteTaskDto.getUuid());
    }
}
