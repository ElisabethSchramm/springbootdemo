# Spring Boot AOP Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `21aop-pointcut-declarations`

This branch builds upon the previous branch [`21aop`] 

In this follow-up branch, the focus was on improving the **reusability and structure of pointcut expressions** by extracting them into named methods.

- **Base Setup (inherited from `21aop`)**
    - Project initialized via [Spring Initializr](https://start.spring.io/)
    - Added `spring-boot-starter-aop` dependency
    - Registered a `CommandLineRunner` bean
    - Created `AccountDAO` interface and `AccountDAOImpl` class
    - Injected `AccountDAO` into `CommandLineRunner` to invoke `addAccount()` on startup
    - Defined `LoggingAspect` class with `@Before` advice

- **Pointcut Declaration Enhancements**
    - Extracted reusable pointcut method `forDaoPackage()`
    - Applied `@Before` advice using named pointcut  

    
