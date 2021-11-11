package com.dorian.todoapi.facade;

import com.dorian.todoapi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardFacadeImpl implements BoardFacade {

    @Autowired
    private BoardService boardService;

}
