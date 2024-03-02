package com.sky.examinator;

import com.sky.examinator.service.ExaminerServiceImpl;
import com.sky.examinator.service.QuestionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTests {

    @Mock
    QuestionService mock;

    @InjectMocks
    ExaminerServiceImpl out;


}
