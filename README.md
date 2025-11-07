## What I Learned in Branch `19jpa-advanced-mappings-one-to-many-uni`

This branch adds a unidirectional one-to-many relationship from `Course` to `Review`.

- added `Review` entity
- mapped `Course` to `Review` with one-to-many
- added `add(Review)` helper in `Course`
- added `save(Course)` in DAO and implementation
- created and saved course with reviews in `main`
- added `findCourseAndReviewsByCourseId(int)` in DAO and implementation
- retrieved course with reviews in `main`
- added `deleteCourseById(int)` and tested deletion in `main`
