# Spring MVC Test – Form Validation with Thymeleaf

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `10spring-mvc-thymeleaf-validation`

This branch focused on implementing form validation using Spring MVC and Thymeleaf.

- **Customer Form with Validation**
    - Introduced `Customer` model with fields:
        - `firstName`, `lastName`, `postalCode`, `freePasses`, `courseCode`
    - Created views:
        - `customer-form.html` – input form
        - `customer-confirmation.html` – confirmation page
    - Controller methods:
        - `CustomerController.showForm()` – displays the form
        - `CustomerController.processForm()` – handles submission and validation

- **Validation Features**
    - Applied standard annotations:
        - `@NotNull`, `@Size`, `@Min`, `@Max`, `@Pattern`
    - Implemented custom annotations:
        - `@CourseCode` – validates course code prefix
        - `@CustomCourse` – uses default value `"Test"`
    - Added logic to:
        - Trim whitespace in controller
        - Externalize error messages via `messages.properties`
