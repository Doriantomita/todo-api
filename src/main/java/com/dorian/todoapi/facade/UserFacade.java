package com.dorian.todoapi.facade;

import com.dorian.todoapi.controller.dto.DisplayUserDto;
import com.dorian.todoapi.controller.dto.UserDto;

/**
 * Layer that retrieves UserModel instances
 * and converts them into UserDto instances
 */

public interface UserFacade {

    void doStuff();

    DisplayUserDto saveUser(UserDto userDto);
}
