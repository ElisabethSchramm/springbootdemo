package dev.es.springbootdemo.springbootdemo.rest;

import dev.es.springbootdemo.springbootdemo.common.Tutor;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TutorRestControllerTest {

    @Test
    void testGetDailyExercise() {
        // Arrange
        Tutor mockTutor = mock(Tutor.class);
        when(mockTutor.getDailyExercise()).thenReturn("Mocked Exercise");

        TutorRestController controller = new TutorRestController();
        controller.setMyTutor(mockTutor);

        // Act
        String result = controller.getDailyExercise();

        // Assert
        assertEquals("Mocked Exercise", result);
    }
}
