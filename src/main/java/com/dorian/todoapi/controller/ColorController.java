package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.ColorFacade;
import org.springframework.beans.factory.annotation.Autowired;

public class ColorController {

    @Autowired
    private ColorFacade colorFacade;
}
