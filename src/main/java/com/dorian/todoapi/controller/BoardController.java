package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.BoardFacade;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardController {

    @Autowired
    private BoardFacade boardFacade;
}
