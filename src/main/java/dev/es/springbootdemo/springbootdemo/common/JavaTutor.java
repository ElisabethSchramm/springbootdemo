package dev.es.springbootdemo.springbootdemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaTutor implements Tutor {

    @Override
    public String getDailyExercise() {
        return "What is the JVM?";
    }
}
