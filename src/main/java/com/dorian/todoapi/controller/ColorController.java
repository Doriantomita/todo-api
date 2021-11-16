package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.ColorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {

    @Autowired
    private ColorFacade colorFacade;
}
