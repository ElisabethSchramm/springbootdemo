# Spring Security – User Registration with JPA/Hibernate

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `16spring-mvc-security-hibernate-user-registration`

This branch adds user registration functionality to a Spring Boot application secured with Spring Security and backed by JPA/Hibernate.

- **AuthenticationSuccessHandler**
    - Implemented `CustomAuthenticationSuccessHandler` to execute after successful login
    - Retrieves user from database via `UserService`
    - Stores user in session using `HttpSession`
    - Redirects to home page

- **Security Configuration**
    - Updated `DemoSecurityConfig` to use `.successHandler(customAuthenticationSuccessHandler)`
    - Permits access to `/register/**` without authentication

- **Login Page**
    - Added "Register New User" button to `fancy-login.html`
    - Links to `/register/showRegistrationForm`

- **Registration Form**
    - Created `registration-form.html` with fields bound to `WebUser`
    - Form posts to `/register/processRegistrationForm`

- **Registration Controller**
    - `GET /register/showRegistrationForm`: displays registration form
    - `POST /register/processRegistrationForm`: processes form data
        - Validates input with `@Valid` and `BindingResult`
        - Checks if username already exists
        - Encrypts password with `BCryptPasswordEncoder`
        - Saves user via `UserService`
        - Stores user in session
        - Redirects to confirmation page

- **Password Encryption**
    - Uses `BCryptPasswordEncoder` to hash plain text password before saving

- **Confirmation Page**
    - Created `registration-confirmation.html`
    - Displays registered user’s username, first name, last name, and email
    - Includes link to login page

- **Validation**
    - Added `@InitBinder` in controller to trim empty strings to `null`

- **Files and Structure**
    - `CustomAuthenticationSuccessHandler.java` in `security/`
    - `DemoSecurityConfig.java` updated in `security/`
    - `RegistrationController.java` in `controller/`
    - `WebUser.java` in `user/`
    - `UserService.java` and `UserServiceImpl.java` in `service/`
    - Templates in `resources/templates/register/`
