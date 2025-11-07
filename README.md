## What I Learned in Branch `20jpa-advanced-mappings-many-to-many`

This branch builds on `19jpa-advanced-mappings-one-to-many-uni` and introduces a bidirectional many-to-many relationship between `Course` and `Student`.

- created the `Student` entity
- added a many-to-many mapping from `Course` to `Student` using a join table
- added an `add(Student)` helper method in `Course`
- mapped `Student` back to `Course` with `mappedBy`
- added an `add(Course)` helper method in `Student` to keep both sides in sync

