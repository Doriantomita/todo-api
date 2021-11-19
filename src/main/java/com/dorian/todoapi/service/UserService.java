package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.model.UserModel;

public interface UserService {
    void doService();

    UserModel saveUser(UserModel userToSave);

    UserModel findUserByUuid(String uuid);
}
