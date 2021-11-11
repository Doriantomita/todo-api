package com.dorian.todoapi.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Log4j2
public class Logging {

    @Before("@annotation(Loggable)")
    public void logExecutionStarted(JoinPoint point) {
        final Signature signature = point.getSignature();
        final Class<?> clazz = point.getSignature().getDeclaringType();
        log.info(clazz.getName() + " method " + signature.getName() + " started executing");
    }

    @After("@annotation(Loggable)")
    public void logExecutionEnded(JoinPoint point) {
        final Signature signature = point.getSignature();
        final Class<?> clazz = point.getSignature().getDeclaringType();
        log.info(clazz.getName() + " method " + signature.getName() + " finished executing");
    }

}
