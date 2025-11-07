# Spring Boot Test

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `02core`

This branch was dedicated to exploring **Spring Core**, the foundational module of the Spring Framework. The focus was on understanding how Spring manages components, dependencies, and bean lifecycles.

- **Core Concepts of Spring**
    - How Spring handles **Dependency Injection (DI)** using `@Autowired` and constructor injection
    - How to use `@Qualifier` to inject specific implementations of an interface
    - How to define and register beans using `@Component`
    - How Spring scans packages and wires components automatically

- **Bean Scopes**
    - Learned the difference between **singleton** and **prototype** scope
    - Applied `@Scope("prototype")` to `JavaTutor` and verified that each injection creates a new instance
    - Used a REST endpoint (`/check`) to compare bean instances and confirm scope behavior

- **Interface-Based Design**
    - Created a `Tutor` interface to define a common contract
    - Implemented multiple tutors: `JavaTutor`, `PythonTutor`, `SoftwarePrinciplesTutor`, `FrontendTutor`
    - Injected tutors into a controller to expose logic via REST endpoints

- **Testing Spring Components**
    - Wrote unit tests using **JUnit 5**
    - Used **Mockito** to mock dependencies and test controller behavior
