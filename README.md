# Spring Boot Test – REST Security with JDBC

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `07rest-security-jdbc`

This branch focused on securing REST endpoints using Spring Security with JDBC-based authentication, including custom table structures and password encryption via BCrypt.

- **Spring Security Setup**
    - Added `spring-boot-starter-security` to the project
    - Configured authentication and authorization via `DemoSecurityConfig`
    - Defined in-memory users using `User.withDefaultPasswordEncoder()` for initial testing
    - Restricted access to REST endpoints based on user roles using `http.authorizeHttpRequests()`

- **JDBC Authentication**
    - Replaced in-memory authentication with JDBC-based authentication
    - Created SQL scripts to initialize the security schema:
        - `04-setup-spring-security-demo-database-plaintext.sql`
        - `05-setup-spring-security-demo-database-bcrypt.sql`
        - `06-setup-spring-security-demo-database-bcrypt-custom-table-names.sql`
    - Configured `JdbcUserDetailsManager` to use custom table and column names
    - Enabled BCrypt password encoding for secure credential storage

- **Custom Table Mapping**
    - Customized table and field names for user and authority storage
    - Updated `JdbcUserDetailsManager` to reflect schema changes
    - Ensured compatibility with Spring Security expectations via SQL and configuration

- **Role-Based Access Control**
    - Defined role-based access rules in `DemoSecurityConfig`
    - Restricted access to employee endpoints based on roles (e.g. `ROLE_MANAGER`)

- **Domain Layer Setup**
    - Implemented `Employee` domain model
    - Created `EmployeeRepository` interface extending `JpaRepository`
    - Developed `EmployeeService` and `EmployeeServiceImpl` for business logic
    - Built `EmployeeRestController` to expose REST endpoints
    - Secured endpoints to allow access only for authenticated users with appropriate roles

- **Benefits of This Approach**
    - Flexible authentication using a real database
    - Secure password handling with BCrypt
    - Customizable schema for integration with existing systems
    - Clean separation between security configuration and business logic
    - Declarative role-based access control
