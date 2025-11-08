package com.example.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // all of related advices for logging

    @Pointcut("execution(* com.example.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){};

    @Pointcut("execution(* com.example.aopdemo.dao.*.get*(..))")
    private void getter(){};

    @Pointcut("execution(* com.example.aopdemo.dao.*.set*(..))")
    private void setter(){};

    @Pointcut("forDaoPackage() && ! (getter() || setter())")
    private void forDaoPackageNoGetterSetter(){
        System.out.println("\n=====>>> beforeAddAccountAdvice");
    };

    @Before("forDaoPackageNoGetterSetter")
    public void beforeAddAccountAdvice(){
        System.out.println("\n=====>>> beforeAddAccountAdvice");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeApiAnalytics(){
        System.out.println("\n=====>>> beforeApiAnalytics");
    }

}
