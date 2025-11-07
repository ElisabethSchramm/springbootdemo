# Spring Boot – One-to-Many Mapping Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21
- Spring Boot 3.5.7
- Maven
- MySQL 8.x

## What I Learned in Branch `19jpa-advanced-mappings-one-to-many-uni`

This branch adds a unidirectional one-to-many relationship from `Course` to `Review`.

- added `Review` entity
- added one-to-many mapping from `Course` to `Review`
- added `add(Review)` helper method in `Course`
- added `save(Course)` method in DAO and implementation
- created course with reviews and saved it in `main`
- added `findCourseAndReviewsByCourseId(int)` method in DAO and implementation
- retrieved course with reviews in `main`
