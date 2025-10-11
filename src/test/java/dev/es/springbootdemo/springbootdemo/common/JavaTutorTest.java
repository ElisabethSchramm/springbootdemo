package dev.es.springbootdemo.springbootdemo.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTutorTest {
    @Test
    public void testGetDailyExercise() {
        Tutor tutor = new JavaTutor();
        String result = tutor.getDailyExercise();

        assertEquals("What is the JVM?", result);
    }
}
