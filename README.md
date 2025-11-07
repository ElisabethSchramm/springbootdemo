# Spring Boot Test – Basic Setup

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `01basic`

This branch focused on setting up a working Spring Boot application and exploring its essential features.

- **Project Initialization**
    - Generated the project using [Spring Initializr](https://start.spring.io)
    - Configured Maven and basic project structure

- **Creating REST Endpoints**
    - Implemented `MyRestController` with three custom endpoints
    - Learned how to use `@RestController` and `@GetMapping`

- **Spring Boot DevTools**
    - Added `spring-boot-devtools` for automatic restarts and live reload during development

- **Spring Boot Actuator**
    - Integrated `spring-boot-starter-actuator` to expose monitoring endpoints
    - Explored default actuator endpoints like `/health` and `/info`

- **Application Configuration**
    - Injected custom properties using `@Value`
    - Exposed team information via a dedicated endpoint
    - Defined metadata and security settings in `application.properties`

- **Logging Setup**
    - Configured log levels and log file output via `application.properties`
    - Used `logging.level.*` and `logging.file.name` to control logging behavior
