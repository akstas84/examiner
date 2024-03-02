package com.sky.examinator.service;

import com.sky.examinator.domain.Question;

import java.util.Collection;


public interface ExaminerService {

    Collection<Question> getQuestions(int amount);

}
