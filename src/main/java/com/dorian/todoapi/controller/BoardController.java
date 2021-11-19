package com.dorian.todoapi.controller;

import com.dorian.todoapi.controller.dto.CreateBoardDto;
import com.dorian.todoapi.controller.dto.DisplayBoardDto;
import com.dorian.todoapi.facade.BoardFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
@AllArgsConstructor
public class BoardController {

    private final BoardFacade boardFacade;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DisplayBoardDto> createBoard(@RequestBody CreateBoardDto createBoardDto){
        return new ResponseEntity<>(boardFacade.createBoard(createBoardDto), HttpStatus.CREATED);
    }
}
