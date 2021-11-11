package com.dorian.todoapi.configuration;

import com.dorian.todoapi.aspect.Logging;
import com.dorian.todoapi.controller.*;
import com.dorian.todoapi.facade.*;
import com.dorian.todoapi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfiguration {

    @Bean
    public BoardFacade boardFacade() {
        return new BoardFacadeImpl();
    }

    @Bean
    public ColorFacade colorFacade() {
        return new ColorFacadeImpl();
    }

    @Bean
    public TaskContainerFacade taskContainerFacade() {
        return new TaskContainerFacadeImpl();
    }

    @Bean
    public TaskFacade taskFacade() {
        return new TaskFacadeImpl();
    }

    @Bean
    public UserFacade userFacade() {
        return new UserFacadeImpl();
    }

    @Bean
    public BoardService boardService() {
        return new BoardServiceImpl();
    }

    @Bean
    public ColorService colorService() {
        return new ColorServiceImpl();
    }

    @Bean
    public TaskContainerService taskContainerService() {
        return new TaskContainerServiceImpl();
    }

    @Bean
    public TaskService taskService() {
        return new TaskServiceImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public BoardController boardController() {
        return new BoardController();
    }

    @Bean
    public ColorController colorController() {
        return new ColorController();
    }

    @Bean
    public TaskContainerController taskContainerController() {
        return new TaskContainerController();
    }

    @Bean
    public TaskController taskController() {
        return new TaskController();
    }

    @Bean
    public UserController userController() {
        return new UserController();
    }

    @Bean
    public Logging logging() {
        return new Logging();
    }
}
