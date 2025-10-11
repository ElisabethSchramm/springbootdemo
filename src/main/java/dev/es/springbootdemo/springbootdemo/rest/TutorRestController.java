package dev.es.springbootdemo.springbootdemo.rest;

import dev.es.springbootdemo.springbootdemo.common.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorRestController {
    private Tutor myTutor;

    @Autowired
    public TutorRestController(@Qualifier("javaTutor") Tutor myTutor) {
        this.myTutor = myTutor;
    }


    @GetMapping("/dailyexercise")
    public String getDailyExercise(){
        return this.myTutor.getDailyExercise();
    }
}
