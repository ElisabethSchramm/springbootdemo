# Spring Security Test – JDBC Authentication with Custom Queries

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.6
- Maven

## What I Learned in Branch `13spring-mvc-thymeleaf-security`

This branch focused on securing a Spring Boot application using Spring Security by replacing in-memory authentication with database-backed authentication using `JdbcUserDetailsManager`, bcrypt password hashes, custom SQL queries, and a MySQL datasource.

- **Database Setup**
    - Added SQL scripts for Spring Security demo
    - Configured MySQL datasource in `application.properties`
    - Included dependencies for JPA and MySQL driver

- **Authentication Refactor**
    - Removed `InMemoryUserDetailsManager` in favor of database-backed authentication
    - Switched to `JdbcUserDetailsManager` with bcrypt password hashes from SQL script

- **Custom Query Configuration**
    - Configured `JdbcUserDetailsManager` with custom SQL queries:
        - `select user_id, pw, active from members where user_id=?`
        - `select user_id, role from roles where user_id=?`
