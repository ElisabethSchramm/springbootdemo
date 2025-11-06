# Spring Security Test – In-Memory Login with Custom Login Page

## Development

This project was developed with:
- IntelliJ IDEA 2025.1.4.1 (Community Edition)
- Java 21 (OpenJDK)
- Spring Boot 3.5.6
- Maven

## What I Learned in Branch `12spring-mvc-thymeleaf-security`

This branch focused on securing a Spring Boot application using Spring Security with in-memory authentication and a custom login page.

- **Controller Setup**
    - Created `DemoController` to serve the homepage (`home.html`)
    - Created `LoginController` to serve the custom login page (`plain-login.html`)

- **Security Configuration**
    - Implemented `DemoSecurityConfig` with:
        - `InMemoryUserDetailsManager` defining three users (`alex`, `paul`, `max`) with different roles
        - `SecurityFilterChain` to restrict access and configure login behavior
    - Configured custom login page at `/showMyLoginPage`
    - Defined login processing URL as `/authenticateTheUser`
    - Enabled role-based access using `http.authorizeHttpRequests()`

- **View Templates**
    - `home.html`: static homepage
    - `plain-login.html`: custom login form with Thymeleaf integration
        - Displays error message on failed login via `${param.error}`
        - Uses `th:action="@{/authenticateTheUser}"` for form submission
