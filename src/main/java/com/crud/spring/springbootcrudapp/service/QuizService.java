package com.crud.spring.springbootcrudapp.service;

import com.crud.spring.springbootcrudapp.entity.Quiz;
import com.crud.spring.springbootcrudapp.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> saveQuizAll(List<Quiz> quizAll) {
        return quizRepository.saveAll(quizAll);
    }

    public List<Quiz> getQuizAll() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(int id) {
        return quizRepository.findById(id).orElse(null);
    }

    public String deleteQuiz(int id) {
        quizRepository.deleteById(id);
        return "Quiz deleted: " + id;
    }

}
