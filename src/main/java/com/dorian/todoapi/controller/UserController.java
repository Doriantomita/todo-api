package com.dorian.todoapi.controller;

import com.dorian.todoapi.controller.dto.DisplayUserDto;
import com.dorian.todoapi.controller.dto.UserDto;
import com.dorian.todoapi.facade.UserFacade;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Log4j2
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping
    public ResponseEntity<DisplayUserDto> createUser(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<>(userFacade.saveUser(userDto), HttpStatus.CREATED);
    }

}
