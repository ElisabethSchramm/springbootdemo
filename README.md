# Spring Boot – One-to-One Mapping Demo

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.7
- Maven
- MySQL 8.x

## What I Learned in Branch `17jpa-advanced-mappings-one-to-one`

This branch focused on building a Spring Boot application with JPA and Hibernate to explore one-to-one entity relationships and basic DAO operations.

### Project Initialization
- Initialized the project using [Spring Initializr](https://start.spring.io)
- Added SQL scripts and configured MySQL datasource in `application.properties`
- Disabled Spring Boot banner with `spring.main.banner-mode=off`

### Entity Design
- Created `Instructor` and `InstructorDetail` entities
- Defined a unidirectional one-to-one relationship from `Instructor` to `InstructorDetail`
- Later made the relationship bidirectional by adding a mapped reference in `InstructorDetail`
- Used `@OneToOne`, `@JoinColumn`, and `mappedBy` annotations to configure the relationship

### DAO Layer
- Defined `AppDAO` interface and implemented it in `AppDAOImpl`
- Implemented methods:
    - `save(Instructor instructor)`
    - `findInstructorById(int id)`
    - `findInstructorDetailById(int id)`
    - `deleteInstructorById(int id)`
- Used `EntityManager` for persistence operations
- Annotated delete method with `@Transactional` to avoid `TransactionRequiredException`

### CommandLineRunner
- Used `CommandLineRunner` to trigger DAO methods at application startup
- Tested saving, fetching, and deleting entities via startup logic
- Verified bidirectional navigation between `Instructor` and `InstructorDetail`

### Hibernate Logging
Enabled SQL and parameter binding logs for debugging:
```properties
logging.level.org.hibernate.SQL=trace
logging.level.org.hibernate.orm.jdbc.bind=trace
