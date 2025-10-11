package dev.es.springbootdemo.springbootdemo.common;

import org.springframework.stereotype.Component;


@Component
public class FrontendTutor implements Tutor {

    @Override
    public String getDailyExercise() {
        return "Rest vs GraphQL?";
    }
}
