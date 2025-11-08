# Spring Boot AOP Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `24aop-ordering-ascpects`

This branch builds on `23aop-combining-pointcuts` and focuses on ordering multiple aspects using the `@Order` annotation to control the execution sequence of cross-cutting concerns.

- **Base Setup**
    - Project initialized via [Spring Initializr](https://start.spring.io/)
    - Added `spring-boot-starter-aop` dependency
    - Registered a `CommandLineRunner` bean
    - Created DAO interface and DAOImpl class
    - Defined multiple aspects (`LoggingAspect`, `CloudAsyncAspect`, `ApiAnalyticsAspect`) with `@Before` advice
    - Centralized pointcut declarations in `AopExpressions` class for reuse across aspects

- **Aspect Execution Ordering**
    - Annotated aspects with `@Order` to define their execution priority    
