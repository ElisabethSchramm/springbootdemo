package com.example.cruddemo;

import com.example.cruddemo.dao.AppDAO;
import com.example.cruddemo.entity.Course;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(AppDAO dao) {
        return runner -> {
            findCoursesForInstructor(dao);
        };
    }

    private void findCoursesForInstructor(AppDAO dao) {
        int id = 1;
        Instructor instructor = dao.findInstructorById(id);
        List<Course> courses = dao.findCoursesByInstructorId(id);

        instructor.setCourses(courses);
    }

    private void findInstructorWithCourses(AppDAO dao) {
        int id = 1;
        Instructor instructor = dao.findInstructorById(id);
    }

    private void createInstructorWithCourses(AppDAO dao) {
        Instructor instructor = new Instructor("Paul", "Mueller", "Paul@Mueller.de");

        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.de", "sleeping");
        instructor.setInstructorDetail(instructorDetail);

        Course courseGo = new Course("Go");
        Course courseJava = new Course("Java");
        instructor.add(courseGo);
        instructor.add(courseJava);

        dao.save(instructor);
    }

    private void deleteInstructorDetail(AppDAO dao) {
        int id = 1;
        dao.deleteInstructorDetailById(id);
    }

    private void findInstructorDetail(AppDAO dao) {
        int id = 1;
        InstructorDetail detail = dao.findInstructorDetailById(id);
    }

    private void deleteInstructor(AppDAO dao) {
        int id = 1;
        dao.deleteInstructorById(id);
    }

    private void findInstructor(AppDAO dao) {
        int id = 1;
        Instructor instructor = dao.findInstructorById(id);
    }

    private void createInstructor(AppDAO dao) {
        Instructor instructor = new Instructor("Max", "Maier", "max@maier.de");

        InstructorDetail instructorDetail = new InstructorDetail("http://www.maxmaier.de/youtube", "eating");

        instructor.setInstructorDetail(instructorDetail);

        dao.save(instructor);
    }
}
