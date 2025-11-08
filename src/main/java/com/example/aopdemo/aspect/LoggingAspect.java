package com.example.aopdemo.aspect;

import com.example.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(3)
public class LoggingAspect {

    @Around("execution(* com.example.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        System.out.println("\n=====>>> aroundGetFortune");

        String method = proceedingJoinPoint.getSignature().toShortString();

        System.out.println("method is: " + method);

        long begin = System.currentTimeMillis();

        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println(e.getMessage());
            // result = "Major accident";
            throw e;
        }

        long end = System.currentTimeMillis();

        long duration = end - begin;

        System.out.println("Duration: " + duration / 1000.0 + " Seconds");

        return result;
    }



    @After("execution(* com.example.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFindAccountsAdvice(JoinPoint joinPoint) {

        System.out.println("\n=====>>> afterFindAccountsAdvice");

        String method = joinPoint.getSignature().toShortString();

        System.out.println("method is: " + method);
    }


    @AfterThrowing(
            pointcut = "execution(* com.example.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "exc"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exc) {

        System.out.println("\n=====>>> afterThrowingFindAccountsAdvice");

        String method = joinPoint.getSignature().toShortString();

        System.out.println("method is: " + method);

        System.out.println("exception is: " + exc);
    }


    @AfterReturning(
            pointcut = "execution(* com.example.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result"
    )
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {

        System.out.println("\n=====>>> afterReturningFindAccountsAdvice");

        String method = joinPoint.getSignature().toShortString();

        System.out.println("method is: " + method);

        System.out.println("result is: " + result);

        convertAccountNameToUpperCase(result);

        System.out.println("modified result is: " + result);

    }

    private void convertAccountNameToUpperCase(List<Account> result) {
        for (Account account : result){
            String upperName = account.getName().toUpperCase();
            account.setName(upperName);
        }
    }

    @Before("com.example.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {

        System.out.println("\n=====>>> beforeAddAccountAdvice");

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method:" + signature);

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
            if (arg instanceof Account) {
                Account account = (Account) arg;
                System.out.println("Account name: " + account.getName());
            }
        }
    }

}
