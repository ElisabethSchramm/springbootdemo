# Spring Boot Test – REST – CRUD

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `05rest-crud`

This branch focused on implementing a complete RESTful CRUD architecture for managing `Employee` entities without using Spring Data JPA. A manual DAO and service layer were used to handle persistence and business logic.

- **Project Structure and Design**
    - Organized code into layered packages:
        - `entity`: defines the `Employee` class with JPA annotations
        - `dao`: contains `EmployeeDAO` interface and `EmployeeDAOJpaImpl` implementation
        - `service`: includes `EmployeeService` interface and `EmployeeServiceImpl`
        - `rest`: provides `EmployeeRestController` for exposing endpoints

- **Manual Persistence Layer**
    - Created a custom `EmployeeDAO` interface
    - Implemented `EmployeeDAOJpaImpl` using `EntityManager` for database operations
    - Omitted Spring Data JPA to focus on low-level JPA interaction

- **Service Layer Abstraction**
    - Defined `EmployeeService` to separate business logic from controller and DAO
    - Implemented `EmployeeServiceImpl` to delegate operations to the DAO layer

- **REST Controller**
    - Built `EmployeeRestController` with full CRUD endpoints:
        - `GET /employees` – retrieve all employees
        - `GET /employees/{id}` – retrieve employee by ID
        - `POST /employees` – add new employee
        - `PUT /employees` – update existing employee
        - `DELETE /employees/{id}` – delete employee by ID
