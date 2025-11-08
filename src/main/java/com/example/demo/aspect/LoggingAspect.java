package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.example.demo.controller.*.*(..))")
    private void forControllerPackage() {
    }

    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    private void forServicePackage() {
    }

    @Pointcut("execution(* com.example.demo.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow() {
    }

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        logger.info("====>> in @Before: calling method: " + method);

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            logger.info("====>> argument: " + arg);
        }
    }
}
