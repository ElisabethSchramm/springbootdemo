# Spring Boot AOP Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `26aop-after-returning`

This branch builds on `25aop-joinpoints` and focuses on using `@AfterReturning` advice to intercept and log the result of method executions after they successfully return.

- **Base Setup**
    - Project initialized via [Spring Initializr](https://start.spring.io/)
    - Added `spring-boot-starter-aop` dependency
    - Registered a `CommandLineRunner` bean
    - Created DAO interface and DAOImpl class
    - Defined multiple aspects (`LoggingAspect`, `CloudAsyncAspect`, `ApiAnalyticsAspect`) with `@Before` advice
    - Centralized pointcut declarations in `AopExpressions` class for reuse across aspects

- **Aspect Execution Ordering**
    - Annotated aspects with `@Order` to define their execution priority    
  
- **Reading Method Arguments with JoinPoint**
    - Used `JoinPoint` in `beforeAddAccountAdvice` to log method signature and arguments
  
- **Intercepting Return Values with @AfterReturning**
    - Added `afterReturningFindAccountsAdvice` to log the method name and returned `List<Account>` result
    - Used `JoinPoint` to extract method metadata
    - Enabled post-execution tracing of DAO method output