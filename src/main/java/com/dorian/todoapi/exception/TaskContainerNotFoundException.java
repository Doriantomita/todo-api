package com.dorian.todoapi.exception;

public class TaskContainerNotFoundException extends RuntimeException {

    public TaskContainerNotFoundException(String message) {
        super(message);
    }
}
