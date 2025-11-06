# Spring MVC Test – Form Handling with Thymeleaf

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `09spring-mvc-thymeleaf`

This branch focused on implementing interactive form handling using Spring MVC and Thymeleaf.

- **Project Initialization**
    - Generated via [Spring Initializr](https://start.spring.io) with:
        - Spring Web
        - Thymeleaf
        - DevTools
    - Configured Maven build and basic project structure

- **Hello World Example**
    - Created `DemoController` and `HelloWorldController` for basic routing and form handling
    - Implemented views:
        - `helloworld.html` – static greeting page
        - `helloworld-form.html` – form input page
    - Added form processing methods:
        - `processForm`, `processForm2`, `letsShout2`
    - Used `@RequestParam` and `@PostMapping` for form submission
    - Styled output with `demo.css`

- **Student Form Example**
    - Introduced `Student` model with fields:
        - `firstName`, `lastName`, `country`, `favoriteLanguage`, `operatingSystems`
    - Created `StudentController` with:
        - `showForm()` to display the form
        - `processForm()` to handle submission
    - Developed templates:
        - `student-form.html` – form input
        - `student-confirmation.html` – confirmation output
    - Enhanced form with:
        - Dropdown (`country`)
        - Radio buttons (`favoriteLanguage`)
        - Checkboxes (`operatingSystems`)
    - Injected form options via controller:
        - `countries`, `programmingLanguages`, `operatingSystems`
