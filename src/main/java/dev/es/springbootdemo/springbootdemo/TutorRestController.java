package dev.es.springbootdemo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorRestController {
    private final Tutor myTutor;

    // for dependency injection
    @Autowired
    public TutorRestController(Tutor tutor) {
        this.myTutor = tutor;
    }

    @GetMapping("/dailyexercise")
    public String getDailyExercise(){
        return this.myTutor.getDailyExercise();
    }
}
