package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.BoardModel;
import com.dorian.todoapi.persistence.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public BoardModel findBoardModelByUuid(String uuid) {
        return boardRepository.findBoardModelByUuid(uuid);
    }

    @Override
    public BoardModel save(BoardModel boardModel) {
        return boardRepository.save(boardModel);
    }
}
