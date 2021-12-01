package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.BoardModel;

public interface BoardService {

    BoardModel findBoardModelByUuid(String uuid);

    BoardModel save(BoardModel boardModel);

    void deleteBoard(String name);
}
