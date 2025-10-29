# Spring Boot Test – CRUD with Thymeleaf

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `11spring-mvc-thymeleaf-crud`

This branch focused on implementing basic CRUD functionality in a Spring MVC web application using Thymeleaf.

- **Project Setup**
    - Migrated files from branch `06restCRUD-with-spring-data`
    - Updated `pom.xml` with required dependencies

- **View Templates**
    - Added `index.html` as static landing page
    - Added `list-employees.html` to display all employees
    - Added `employee-form.html` for creating and editing employees

- **Controller**
    - Created `EmployeeController` with endpoints:
        - `/employees/list` – show all employees
        - `/employees/showFormForAdd` – show empty form
        - `/employees/showFormForUpdate` – load employee into form
        - `/employees/save` – handle form submission
        - `/employees/delete` – delete employee by ID

- **CRUD Operations**
    - Save: added functionality to save employee
    - Update: added functionality to update employee
    - Delete: added functionality to delete employee
    - List: updated employee list to be sorted by last name
