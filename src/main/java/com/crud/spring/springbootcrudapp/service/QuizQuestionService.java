package com.crud.spring.springbootcrudapp.service;
import com.crud.spring.springbootcrudapp.entity.QuizQuestion;
import com.crud.spring.springbootcrudapp.repository.QuizQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizQuestionService {

    @Autowired
    private QuizQuestionRepository quizQuestionRepository;

    public QuizQuestion saveQuizQuestion(QuizQuestion quizQuestion) {
        return  quizQuestionRepository.save(quizQuestion);
    }

    public List<QuizQuestion> saveQuizQuestionAll(List<QuizQuestion> quizQuestions) {
        return quizQuestionRepository.saveAll(quizQuestions);
    }

    public List<QuizQuestion> getQuizQuestionAll() {
        return quizQuestionRepository.findAll();
    }

    public QuizQuestion getQuizQuestionById(int id) {
        return quizQuestionRepository.findById(id).orElse(null);
    }

    public String deleteQuizQuestion(int id) {
        quizQuestionRepository.deleteById(id);
        return "Quiz Question deleted: " + id;
    }

}
