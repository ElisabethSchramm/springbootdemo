# Spring Boot – One-to-Many Mapping Demo

## Development

This project was developed with:
- IntelliJ IDEA
- Java 21 
- Spring Boot 3.5.7
- Maven
- MySQL 8.x

## What I Learned in Branch `18jpa-one-to-many-courses`

This branch builds on the previous one-to-one setup and introduces a one-to-many relationship between `Instructor` and `Course`.

### Entity Design
- Added `Course` entity with basic fields and annotations
- Linked `Course` to `Instructor` using `@ManyToOne` and `@JoinColumn(name="instructor_id")`
- Extended `Instructor` entity with:
  ```java
  @OneToMany(mappedBy = "instructor", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  private List<Course> courses;
