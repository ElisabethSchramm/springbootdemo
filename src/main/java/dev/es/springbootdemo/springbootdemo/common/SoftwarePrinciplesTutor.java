package dev.es.springbootdemo.springbootdemo.common;

import org.springframework.stereotype.Component;


@Component
public class SoftwarePrinciplesTutor implements Tutor {

    @Override
    public String getDailyExercise() {
        return "What ist Dependency Injection?";
    }
}
