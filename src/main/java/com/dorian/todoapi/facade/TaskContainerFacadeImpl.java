package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.CreateTaskContainerDto;
import com.dorian.todoapi.controller.dto.TaskContainerDto;
import com.dorian.todoapi.persistence.model.TaskContainerModel;
import com.dorian.todoapi.service.BoardService;
import com.dorian.todoapi.service.TaskContainerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
@AllArgsConstructor
public class TaskContainerFacadeImpl implements TaskContainerFacade {

    private final TaskContainerService taskContainerService;

    private final BoardService boardService;

    private final ModelMapper modelMapper;

    @Override
    public TaskContainerDto createTaskContainer(String parentBoardUuid, CreateTaskContainerDto createTaskContainerDto) {
        TaskContainerModel taskContainerModel = modelMapper.map(createTaskContainerDto, TaskContainerModel.class);
        taskContainerModel.setUuid(UUID.randomUUID().toString());
        taskContainerModel.setTasks(Collections.emptyList());
        taskContainerModel.setParentBoard(boardService.findBoardModelByUuid(parentBoardUuid));

        return modelMapper.map(taskContainerService.save(taskContainerModel), TaskContainerDto.class);
    }
}
