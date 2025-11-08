# Spring Boot AOP Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch ` 28aop-after`

This branch builds on `27aop-after-throwing` and focuses on using `@After` advice to execute logic after a method completes—regardless of its outcome (success or exception).

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
    - Modified returned data 
  
- **Handling Exceptions with @AfterThrowing**
    - Added `afterThrowingFindAccountsAdvice` to log exceptions thrown by the `findAccounts()` method
    - Used `JoinPoint` to capture method signature and exception details

- **Finalizing Method Execution with @After**
    - Added `afterFindAccountsAdvice` to log the method signature of `findAccounts()` after its execution
    - Demonstrated how `@After` advice runs in all cases, whether the method returns normally or throws an exception