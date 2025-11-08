package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.example.demo.controller.*.*(..))")
    private void forControllerPackage(){}

    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    private void forServicePackage(){}

    @Pointcut("execution(* com.example.demo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow(){}
}
