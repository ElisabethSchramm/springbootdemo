# Spring Boot Test – REST Security with Hibernate

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.6
- Maven

## What I Learned in Branch `08rest-security-hibernate`

This branch focused on securing REST endpoints using Spring Security with Hibernate-based authentication and authorization, including custom entity mappings and role management.

- **Project Initialization**
    - Initialized the project using Spring Initializr with dependencies for Spring Web, Spring Security, Spring Data JPA, and H2
    - Configured Maven build via `pom.xml`
    - Added SQL scripts for database setup:
        - `01-employee-directory.sql` – basic employee data
        - `02-setup-spring-security-demo-database-hibernate-bcrypt.sql` – user, role, and authority setup with BCrypt

- **Domain and Persistence Layer**
    - Defined JPA entities:
        - `Employee` – business domain object
        - `User` – represents authenticated users
        - `Role` – defines user roles and authorities
    - Implemented DAO interfaces and classes:
        - `EmployeeRepository` for CRUD operations
        - `UserDao`, `UserDaoImpl` for user persistence
        - `RoleDao`, `RoleDaoImpl` for role persistence

- **Service Layer**
    - Created service interfaces and implementations:
        - `EmployeeService`, `EmployeeServiceImpl`
        - `UserService`, `UserServiceImpl`
    - Encapsulated business logic and data access

- **REST Layer**
    - Built `EmployeeRestController` to expose REST endpoints for employee operations
    - Secured endpoints based on user roles

- **Security Configuration**
    - Implemented `DemoSecurityConfig` to configure Spring Security
    - Integrated Hibernate-based authentication using custom `User` and `Role` entities
    - Enabled password encryption with BCrypt
    - Defined role-based access rules using `http.authorizeHttpRequests()`

- **Benefits of This Approach**
    - Full-stack security integration using Hibernate and Spring Security
    - Customizable user and role model
    - Secure password handling with BCrypt
    - Clear separation of concerns across layers (DAO, Service, REST, Security)
    - Declarative role-based access control
