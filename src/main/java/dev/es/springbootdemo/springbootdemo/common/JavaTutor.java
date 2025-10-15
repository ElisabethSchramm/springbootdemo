package dev.es.springbootdemo.springbootdemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class JavaTutor implements Tutor {

    @Override
    public String getDailyExercise() {
        return "What is the JVM?";
    }

}
