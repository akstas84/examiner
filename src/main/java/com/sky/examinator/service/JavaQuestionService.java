package com.sky.examinator.service;

import com.sky.examinator.domain.Question;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class JavaQuestionService implements QuestionService {

    Random generator;

    private final Map<String, Question> questonAnswerMap;

    public JavaQuestionService() {
        questonAnswerMap = new HashMap<>();
        generator = new Random();
    }

    @Override
    public Question add(String question, String answer) {
        Question qst = new Question(question, answer);
        questonAnswerMap.put(qst.getQuestion(), qst);
        return new Question(question, answer);
    }


    @Override
    public Question remove(Question question) {
        if (questonAnswerMap.containsKey(question.getQuestion())) {
            questonAnswerMap.remove(question.getQuestion());
        }
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questonAnswerMap.values());
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> valuesList = new ArrayList<>(questonAnswerMap.values());
        return valuesList.get(generator.nextInt(valuesList.size()));
    }

}
