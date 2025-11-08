# Spring Boot MVC CRUD Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `30mvc-crud-employees`

This branch introduces a full-featured MVC CRUD application for managing employees.

- **Base Setup**
    - Project initialized via [Spring Initializr](https://start.spring.io/)
    - Added dependencies: Web, Thymeleaf, Spring Data JPA, MySQL Driver, DevTools, Test
    - Added `spring-boot-starter-aop` for aspect-oriented programming support

- **Database Setup**
    - Created MySQL database `employee_directory`
    - Defined `employee` table with columns: `id`, `first_name`, `last_name`, `email`
    - Inserted initial seed data

- **Entity Layer**
    - Created `Employee` entity with fields: `id`, `firstName`, `lastName`, `email`
    - Annotated with `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, and `@Column`
    - Included constructors, getters/setters, and `toString()` method

- **Service Layer**
    - Defined `EmployeeService` interface with methods: `findAll`, `findById`, `save`, `deleteById`
    - Implemented `EmployeeServiceImpl` with injected `EmployeeRepository`
    - Used `Optional` for safe retrieval and exception handling

- **Controller Layer**
    - Created `EmployeeController` with mappings:
        - `/employees/list` – list all employees
        - `/employees/showFormForAdd` – show form to add new employee
        - `/employees/showFormForUpdate` – show form to update existing employee
        - `/employees/save` – save or update employee
        - `/employees/delete` – delete employee by ID
    - Used `Model` to pass data to Thymeleaf templates

- **Demo Controller**
    - Added `DemoController` with `/hello` endpoint to display current date

- **Thymeleaf Integration**
    - Prepared views: `helloworld.html`, `employee-form.html`, `list-employees.html`
    - Used `th:object` and `th:field` for form binding

- **Aspect Layer**
    - Created `LoggingAspect` class annotated with `@Aspect` and `@Component`
    - Defined reusable pointcuts for:
        - `com.example.demo.controller.*`
        - `com.example.demo.service.*`
        - `com.example.demo.dao.*`
    - Combined pointcuts into `forAppFlow()` for centralized cross-cutting logic