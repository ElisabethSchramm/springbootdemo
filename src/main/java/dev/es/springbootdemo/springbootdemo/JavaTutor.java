package dev.es.springbootdemo.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class JavaTutor implements Tutor{


    @Override
    public String getDailyExercise() {
        return "What is the JVM?";
    }
}
