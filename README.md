# Spring Security – Public Landing Page

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `16spring-mvc-thymeleaf-security-landing-page`

This branch adds a publicly accessible landing page to a Spring Boot application secured with Spring Security.

- **Security Configuration**
    - Updated `DemoSecurityConfig` to allow public access to `/`
    - Added `.requestMatchers("/").permitAll()` to allow anonymous access
    - Configured `.logoutSuccessUrl("/")` to redirect to landing page after logout

- **Controller**
    - Added `@GetMapping("/")` in `DemoController` to serve landing page
    - Changed original home mapping from `/` to `/employees`

- **Landing Page**
    - Created `landing.html` in `resources/templates/`
    - Displays public welcome message
    - Includes link to `/employees` (secured area)

- **Behavior**
    - Landing page is accessible without login
    - Clicking the secure link requires authentication

- **Files and Structure**
    - `DemoSecurityConfig.java` updated in `security/`
    - `DemoController.java` updated in `controller/`
    - `landing.html` added to `resources/templates/`
