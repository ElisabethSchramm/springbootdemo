# Spring Boot AOP Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `21aop`

This branch explores **Spring AOP (Aspect-Oriented Programming)**, a powerful module that allows separation of cross-cutting concerns such as logging from business logic.

- **Project Initialization**
    - Initialized the project using [Spring Initializr](https://start.spring.io/)
    - Added the `spring-boot-starter-aop` dependency to enable AOP support

- **CommandLineRunner Setup**
    - Registered a `CommandLineRunner` bean in the main class
  
- **DAO Setup and Target**
    - Created `AccountDAO` interface and `AccountDAOImpl` class with `addAccount()` method
    - Injected `AccountDAO` into `CommandLineRunner` to invoke `addAccount()` on startup

- **Aspect Definition**
    - Created `LoggingAspect` class 
    - Added `@Before` advice to log method execution before `addAccount()` is called

- **Pointcut Expression**
    - Tested how method name matching influences interception
    - Tested how parameter type matching influences interception (e.g. addAccount(Account))

