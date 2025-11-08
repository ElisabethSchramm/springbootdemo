package com.example.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // all of related advices for logging

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n=====>>> Executing @Before advice on addAccount");
    }

    @Before("execution(public void updateAccount())")
    public void beforeUpdateAccountAdvice(){
        System.out.println("\n=====>>> Executing @Before advice on updateAccount");
    }
}
