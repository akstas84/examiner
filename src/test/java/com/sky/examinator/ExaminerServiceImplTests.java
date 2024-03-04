package com.sky.examinator;

import com.sky.examinator.service.ExaminerServiceImpl;
import com.sky.examinator.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static com.sky.examinator.TestData.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTests {

    @Mock
    QuestionService mock;

    @InjectMocks
    ExaminerServiceImpl out;


    @Test
    void getQuestions() {
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION3);
        assertTrue(out.getQuestions(ID).contains(FULL_QUESTION3));
    }

}
