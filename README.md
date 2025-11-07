# Spring Boot – One-to-Many Mapping Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven
- MySQL 8.x

## What I Learned in Branch `20jpa-advanced-mappings-many-to-many`

This branch builds on `19jpa-advanced-mappings-one-to-many-uni` and introduces a bidirectional many-to-many relationship between `Course` and `Student`.

- created the `Student` entity

- added a many-to-many mapping from `Course` to `Student` using a join table

- mapped `Student` back to `Course` with `mappedBy`

- added `createCourseAndStudents()` in `main` to test the many-to-many setup

- added `findCourseAndStudentsByCourseId(int)` in DAO and implementation
- retrieved course with students in `main`

- added `findStudentAndCoursesByStudentId(int)` in DAO and implementation
- retrieved student with courses in `main`

- added `update(Student)` in DAO and implementation
- added `addMoreCoursesForStudent()` in `main` to test updating a student with new courses



