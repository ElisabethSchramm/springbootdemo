package dev.es.springbootdemo.springbootdemo.common;

import org.springframework.stereotype.Component;


@Component
public class PythonTutor implements Tutor {

    @Override
    public String getDailyExercise() {
        return "What is Duck Typing?";
    }
}
