package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.CreateBoardDto;
import com.dorian.todoapi.controller.dto.DeleteBoardDto;
import com.dorian.todoapi.controller.dto.DisplayBoardDto;
import com.dorian.todoapi.persistence.model.BoardModel;
import com.dorian.todoapi.persistence.model.UserModel;
import com.dorian.todoapi.service.BoardService;
import com.dorian.todoapi.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class BoardFacadeImpl implements BoardFacade {

    private final BoardService boardService;

    private final UserService userService;

    private final ModelMapper modelMapper;

    @Override
    public DisplayBoardDto createBoard(CreateBoardDto createBoardDto) {
        BoardModel boardModel = modelMapper.map(createBoardDto, BoardModel.class);

        boardModel.setUuid(UUID.randomUUID().toString());
        UserModel userModel = userService.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        boardModel.setCreatedBy(userModel);
        boardModel.setAccessors(List.of(userModel));
        boardModel.setContainers(Collections.emptyList());
        boardModel.setShared(false);

        return modelMapper.map(boardService.save(boardModel), DisplayBoardDto.class);
    }

    @Override
    public void deleteBoard(DeleteBoardDto deleteBoardDto) {
        boardService.deleteBoard(deleteBoardDto.getUuid());
    }
}
