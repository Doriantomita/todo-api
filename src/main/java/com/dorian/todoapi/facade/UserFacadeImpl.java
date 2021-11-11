package com.dorian.todoapi.facade;

import com.dorian.todoapi.aspect.Loggable;
import com.dorian.todoapi.service.UserService;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Log4j2
@Getter
@Component
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Value("#{2 < 5}")
    private boolean relationalExpression;

    @Override
    @Loggable
    public void doStuff() {
        log.info("Relational expression in UserFacadeImpl : " + relationalExpression);
        log.info("userFacade");
        userService.doService();
    }
}
