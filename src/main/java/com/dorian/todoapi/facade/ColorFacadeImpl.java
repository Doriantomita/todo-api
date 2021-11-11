package com.dorian.todoapi.facade;

import com.dorian.todoapi.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;

public class ColorFacadeImpl implements ColorFacade {

    @Autowired
    private ColorService colorService;

}
