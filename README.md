# Spring Boot Test – Hibernate/JPA – CRUD

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.6
- Maven

## What I Learned in Branch `03hibernate-crud`

This branch focused on integrating Hibernate/JPA into a Spring Boot application and implementing basic CRUD functionality with REST endpoints and lifecycle management.

- **Spring Boot Configuration**
    - Disabled the default startup banner via `application.properties`
    - Reduced logging output for cleaner console feedback
    - Used `CommandLineRunner` to print a startup message

- **Persistence and Data Initialization**
    - Added `mysql-connector-j` and `spring-boot-starter-data-jpa` to `pom.xml`
    - Created `Student` entity with basic fields and JPA annotations
    - Added SQL files to populate initial data

- **REST API Development**
    - Implemented `StudentRestController` to expose student data
    - Added endpoints for basic CRUD operations

- **Exception Handling**
    - Created `StudentNotFoundException` and `StudentErrorResponse`
    - Handled exceptions locally using `@ExceptionHandler`
    - Refactored to global exception handling using `@ControllerAdvice`

- **Bean Lifecycle**
    - Applied `@PostConstruct` and `@PreDestroy` to `JavaTutor` for initialization and cleanup logic
