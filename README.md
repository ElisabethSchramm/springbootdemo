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
    - Added `Course` entity with fields `id`, `title`, and reference to `Instructor`
    - Added `InstructorDetail` entity with fields `id`, `youtubeChannel`, and `hobby`
    - Linked `InstructorDetail` to `Instructor` via one-to-one bidirectional mapping
    - Linked `Course` to `Instructor` using many-to-one mapping
    - Extended `Instructor` with one-to-many mapping to `Course` and one-to-one mapping to `InstructorDetail`
    - Added helper method `add(Course)` in `Instructor` to manage bidirectional relationship

- **Eager Loading**
    - Used `FetchType.EAGER` to load courses automatically with instructor
    - Added method to retrieve instructor with associated courses
    - Added DAO method `findInstructorByIdJoinFetch(int id)` using JPQL JOIN FETCH

- **Lazy Loading**
    - Switched to `FetchType.LAZY` for on-demand course loading
    - Declared method in DAO to load courses by instructor ID
    - Implemented JPQL query in DAO implementation
    - Added method in `main` to test lazy loading behavior

- **CRUD Operations**
    - Created instructor with associated instructor detail and courses
    - Retrieved instructor and instructor detail by ID
    - Deleted instructor and instructor detail by ID
    - Detached courses before deleting instructor to avoid foreign key constraint violations
    - Updated instructor using DAO and merge operation
    - Retrieved and updated course using DAO methods `findCourseById` and `update`


