# Spring Boot AOP Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `23aop-combining-pointcuts`

This branch builds on `22aop-pointcut-declarations` and focuses on refining pointcut expressions by combining named pointcuts with logical operators to exclude getters and setters. It demonstrates how to modularize and control AOP interception more precisely.

- **Base Setup (inherited from `21aop`)**
    - Project initialized via [Spring Initializr](https://start.spring.io/)
    - Added `spring-boot-starter-aop` dependency
    - Registered a `CommandLineRunner` bean
    - Created `AccountDAO` interface and `AccountDAOImpl` class
    - Injected `AccountDAO` into `CommandLineRunner` to invoke `addAccount()` on startup
    - Defined `LoggingAspect` class with `@Before` advice

- **Pointcut Declaration Enhancements**
    - Extracted reusable pointcut method 
    - Applied `@Before` advice using named pointcut

- **DAO Field Extension**
    - Added fields to DAO with getter and setter methods

- **Combining Pointcuts with Logical Operators**
    - Defined separate pointcuts for getter and setter methods
    - Combined them with to exclude accessors

    
