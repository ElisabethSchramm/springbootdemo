package dev.es.springbootdemo.springbootdemo;

import dev.es.springbootdemo.springbootdemo.dao.StudentDAO;
import dev.es.springbootdemo.springbootdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

/**
 * Spring Boot Demo
 */
@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        int numRowsDeleted = studentDAO.deleteAll();
        System.out.println("Deleted row count: " + numRowsDeleted);
    }


    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Deleting student id: " + studentId);
        studentDAO.delete(studentId);
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Getting student with id: " + studentId);
        Student myStudent = studentDAO.findById(studentId);
        myStudent.setFirstName("GlaDOS");
        studentDAO.update(myStudent);
        System.out.println("Updated student: " + myStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        List<Student> theStudents = studentDAO.findByLastName("Doe");
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> theStudents = studentDAO.findAll();
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        Student cave = new Student("Cave", "Johnsons", "cave@aperture.com");
        studentDAO.save(cave);
        System.out.println("\nRetrieving student with id: " + cave.getId());
        Student myStudent = studentDAO.findById(cave.getId());
        System.out.println("Found the student: " + myStudent);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        Student chell = new Student("Chell", "Johnsons", "chell@aperture.com");
        Student cave = new Student("Cave", "Johnsons", "cave@aperture.com");
        Student caroline = new Student("Caroline", "Caroline", "caroline@aperture.com");
        studentDAO.save(chell);
        studentDAO.save(cave);
        studentDAO.save(caroline);
    }

    private void createStudent(StudentDAO studentDAO) {
        Student chell = new Student("Chell", "Johnsons", "chell@aperture.com");
        studentDAO.save(chell);
        System.out.println("Saved student. Generated id: " + chell.getId());
    }
}
