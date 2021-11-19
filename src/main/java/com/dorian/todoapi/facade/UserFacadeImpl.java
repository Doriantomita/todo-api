package com.dorian.todoapi.facade;

import com.dorian.todoapi.aspect.Loggable;
import com.dorian.todoapi.controller.dto.DisplayUserDto;
import com.dorian.todoapi.controller.dto.UserDto;
import com.dorian.todoapi.persistence.model.Role;
import com.dorian.todoapi.persistence.model.UserModel;
import com.dorian.todoapi.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Log4j2
@AllArgsConstructor
@Getter
@Component
public class UserFacadeImpl implements UserFacade {

    private final UserService userService;

    private final ModelMapper modelMapper;

    @Override
    @Loggable
    public void doStuff() {
        log.info("userFacade");
        userService.doService();
    }

    @Override
    public DisplayUserDto saveUser(UserDto userDto) {
        UserModel userModel = modelMapper.map(userDto, UserModel.class);
        userModel.setUuid(UUID.randomUUID().toString());
        userModel.setRole(Role.OBSERVER);
        userModel.setAccessibleBoards(Collections.emptyList());
        userModel.setAssignedTasks(Collections.emptyList());
        return modelMapper.map(userService.saveUser(userModel), DisplayUserDto.class);
    }
}
