package com.example.cruddemo;

import com.example.cruddemo.dao.AppDAO;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(AppDAO dao) {
        return runner -> {
            deleteInstructorDetail(dao);
        };
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
