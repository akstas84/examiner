package com.sky.examinator.service;


import com.sky.examinator.domain.Question;
import com.sky.examinator.exception.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;


@Service
public class ExaminerServiceImpl implements ExaminerService {

    int questionLimit = 7;

    QuestionService questionService;

    ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> collection = new ArrayList<>();
        if (amount > questionLimit) {
            throw new BadRequestException("BAD_REQUEST");
        }
        collection.add(questionService.getRandomQuestion());
        return collection;
    }

}
