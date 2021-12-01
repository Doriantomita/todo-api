package com.dorian.todoapi.service;

import com.dorian.todoapi.exception.BoardNotFoundException;
import com.dorian.todoapi.persistence.model.BoardModel;
import com.dorian.todoapi.persistence.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public BoardModel findBoardModelByUuid(String uuid) {
        return boardRepository.findBoardModelByUuid(uuid).orElseThrow(() -> new BoardNotFoundException(
                MessageFormat.format("No board with uuid {0} found", uuid)
        ));
    }

    @Override
    public BoardModel save(BoardModel boardModel) {
        return boardRepository.save(boardModel);
    }

    @Override
    public void deleteBoard(String uuid) {
        boardRepository.delete(findBoardModelByUuid(uuid));
    }

}
