package dev.es.springbootdemo.springbootdemo.rest;

import dev.es.springbootdemo.springbootdemo.common.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorRestController {
    private final Tutor myTutor;
    private final Tutor tutor;
    @Autowired
    public TutorRestController(@Qualifier("javaTutor") Tutor myTutor,
                               @Qualifier("javaTutor") Tutor tutor) {
        this.myTutor = myTutor;
        this.tutor = tutor;
    }

    @GetMapping("/dailyexercise")
    public String getDailyExercise(){
        return this.myTutor.getDailyExercise();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myTutor == tutor);
    }
}
