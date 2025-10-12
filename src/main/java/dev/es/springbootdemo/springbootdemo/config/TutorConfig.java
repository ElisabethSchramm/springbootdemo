package dev.es.springbootdemo.springbootdemo.config;

import dev.es.springbootdemo.springbootdemo.common.SQLTutor;
import dev.es.springbootdemo.springbootdemo.common.Tutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TutorConfig {

    @Bean("relational")
    public Tutor sQLTutor(){
        return new SQLTutor();
    }
}
