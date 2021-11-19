package com.dorian.todoapi.controller;

import com.dorian.todoapi.facade.ColorFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colors")
@AllArgsConstructor
public class ColorController {

    private ColorFacade colorFacade;
}
