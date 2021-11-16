package com.dorian.todoapi.facade;

import com.dorian.todoapi.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorFacadeImpl implements ColorFacade {

    @Autowired
    private ColorService colorService;

}
