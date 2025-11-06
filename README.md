# Spring Boot Test – Core Features and Configuration

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.6
- Maven

## What I Learned in Branch `03spring-boot-basics`

This branch focused on exploring core Spring Boot features, configuration options, and basic persistence setup.

- **Project Initialization**
    - Migrated base project from branch `02core`
    - Configured `pom.xml` with essential starters

- **REST Endpoints**
    - Used `@RestController` and `@GetMapping` to create custom endpoints
    - Implemented startup message via `CommandLineRunner`

- **Lifecycle Management**
    - Applied `@PostConstruct` and `@PreDestroy` to `JavaTutor` for init and cleanup logic

- **Application Configuration**
    - Disabled Spring Boot startup banner via `application.properties`
    - Adjusted logging level to reduce console output

- **Monitoring and Security**
    - Integrated `spring-boot-starter-actuator` to expose endpoints like `/health` and `/info`
    - Added `spring-boot-starter-security` to secure actuator endpoints

- **Persistence Setup**
    - Added `mysql-connector-j` and `spring-boot-starter-data-jpa` to `pom.xml`
    - Created `Student` entity with basic fields and annotations
    - Added SQL files for initial database population

- **Logging**
    - Configured logging via `application.properties` using `logging.level.*` and `logging.file.name`
