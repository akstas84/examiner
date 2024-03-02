package com.sky.examinator.controller;

import com.sky.examinator.domain.Question;
import com.sky.examinator.service.ExaminerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "/get/{id}")
    public Collection<Question> getQuestions(@PathVariable int id) {
        return examinerService.getQuestions(id);
    }

}
