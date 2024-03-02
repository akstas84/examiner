package com.sky.examinator;


import com.sky.examinator.service.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.sky.examinator.TestData.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();

    @BeforeEach
    void before() {
        out.add(QUESTION1, ANSWER1);
    }

    @Test
    void add() {
        assertTrue(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void remove() {
        out.remove(FULL_QUESTION1);
        assertFalse(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void getAll() {
        out.add(QUESTION2, ANSWER2);
        out.add(QUESTION3, ANSWER3);
        assertTrue(out.getAll().contains(FULL_QUESTION1));
        assertTrue(out.getAll().contains(FULL_QUESTION2));
        assertTrue(out.getAll().contains(FULL_QUESTION3));
    }

}
