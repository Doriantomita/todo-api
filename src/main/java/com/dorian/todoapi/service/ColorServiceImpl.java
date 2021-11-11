package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.repository.ColorRepository;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl implements ColorService {

    private ColorRepository colorRepository;

}
