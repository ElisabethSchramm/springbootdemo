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


    @PostConstruct
    public void init(){
        System.out.println("In init: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void destruct(){
        System.out.println("In destroy: " + getClass().getSimpleName());
    }
}
