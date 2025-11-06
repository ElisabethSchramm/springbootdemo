# Spring Security Test – In-Memory Login with Custom Login Page

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `12spring-mvc-thymeleaf-security`

This branch focused on securing a Spring Boot application using Spring Security, starting with in-memory authentication and a custom login page, and extending it with role-based access control, Thymeleaf integration, and improved login/logout behavior.

- **Project Setup**
    - Initialized with Spring Web, Thymeleaf, Security, and DevTools

- **Controller and Template Setup**
    - Added `DemoController` and `home.html` template for basic routing
    - Fixed typos in `home.html`
    - Added `LoginController` and `plain-login.html` for custom login page

- **Security Configuration**
    - Added `DemoSecurityConfig` with in-memory user authentication
    - Configured `SecurityFilterChain` to use custom login form
    - Defined login page at `/showMyLoginPage` and login processing URL `/authenticateTheUser`

- **Login Behavior**
    - Displayed error message on failed login attempt
    - Highlighted login error message in red via CSS class
    - Replaced `plain-login.html` with `bootstrap-login.html` and updated controller mapping
    - Added logout support to security config and updated templates for logout feedback

- **User Info in Views**
    - Displayed authenticated username and roles using Spring Security Thymeleaf extras

- **Role-Based Access**
    - Added `/leaders` route and view with role-based access for MANAGER users
    - Restricted URL access based on roles: EMPLOYEE, MANAGER, ADMIN via `SecurityFilterChain`
    - Added `/systems` route, link in `home.html`, and `systems.html` view for ADMIN-only access
    - Added custom access-denied page and controller mapping for unauthorized role access
    - Conditionally displayed content based on user roles using `sec:authorize` in Thymeleaf