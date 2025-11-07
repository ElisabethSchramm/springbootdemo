# Spring Boot – One-to-Many Mapping Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven
- MySQL 8.x

## What I Learned in Branch `18jpa-advanced-mappings-one-to-many`

This branch builds on the previous one-to-one setup and introduces a one-to-many relationship between `Instructor` and `Course`. It also explores the transition from eager to lazy loading to improve performance and flexibility.

- **Entity Design**
    - Added `Course` entity with basic fields and annotations
    - Linked `Course` to `Instructor` using many-to-one mapping
    - Extended `Instructor` with one-to-many mapping and eager fetch strategy

- **Eager Loading**
    - Used `FetchType.EAGER` to load courses automatically with instructor
    - Added method to retrieve instructor with associated courses

- **Lazy Loading**
    - Switched to `FetchType.LAZY` for on-demand course loading
    - Declared method in DAO to load courses by instructor ID
    - Implemented JPQL query in DAO implementation
    - Added method in `main` to test lazy loading behavior
