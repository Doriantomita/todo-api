package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.CreateBoardDto;
import com.dorian.todoapi.controller.dto.DeleteBoardDto;
import com.dorian.todoapi.controller.dto.DisplayBoardDto;

/**
 * Layer that retrieves BoardModel instances
 * and converts them into CreateBoardDto instances
 */

public interface BoardFacade {

    DisplayBoardDto createBoard(CreateBoardDto createBoardDto);

    void deleteBoard(DeleteBoardDto deleteBoardDto);
}
