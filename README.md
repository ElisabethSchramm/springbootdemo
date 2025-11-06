# Spring Boot Test – REST – CRUD with Spring Data

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.6
- Maven

## What I Learned in Branch `06spring-data-crud`

This branch focused on replacing the manual REST CRUD implementation with a declarative, repository-based approach using Spring Data JPA and Spring Data REST.

- **Migration Highlights**
    - Removed custom DAO and service layers:
        - `EmployeeDAO`, `EmployeeDAOJpaImpl`
        - `EmployeeService`, `EmployeeServiceImpl`
        - `EmployeeRestController`
    - Introduced `EmployeeRepository` interface:
        - Extends `JpaRepository<Employee, Integer>`
        - Annotated with `@RepositoryRestResource(path="members")` to expose REST endpoints under `/members`

- **Spring Data REST Integration**
    - Added dependency: `spring-boot-starter-data-rest`
    - REST endpoints automatically exposed based on repository interface
    - Eliminated boilerplate code for CRUD operations

- **Swagger UI Support**
    - Added dependency: `springdoc-openapi-starter-webmvc-ui`
    - Swagger UI available at: `http://localhost:8080/swagger-ui.html`
    - OpenAPI specs:
        - JSON: `http://localhost:8080/v3/api-docs`
        - YAML: `http://localhost:8080/v3/api-docs.yaml`

- **Available Endpoints**
    - `GET /members` – list all employees
    - `GET /members/{id}` – get employee by ID
    - `POST /members` – add new employee
    - `PUT /members/{id}` – update employee
    - `DELETE /members/{id}` – delete employee

- **Benefits of This Approach**
    - Faster development with less manual coding
    - Automatic REST endpoint generation
    - Built-in support for pagination, sorting, and HATEOAS
    - Clean separation of concerns and reduced complexity
