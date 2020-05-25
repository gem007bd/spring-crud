package com.crud.spring.springbootcrudapp.service;
import com.crud.spring.springbootcrudapp.entity.QuizAnswer;
import com.crud.spring.springbootcrudapp.repository.QuizAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizAnswerService {

    @Autowired
    private QuizAnswerRepository quizAnswerRepository;

    public QuizAnswer saveQuizAnswer(QuizAnswer quizAnswer) {
        return  quizAnswerRepository.save(quizAnswer);
    }

    public List<QuizAnswer> saveQuizAnswers(List<QuizAnswer> quizAnswers) {
        return quizAnswerRepository.saveAll(quizAnswers);
    }

    public List<QuizAnswer> getQuizAnswers() {
        return quizAnswerRepository.findAll();
    }

    public QuizAnswer getQuizAnswerById(int id) {
        return quizAnswerRepository.findById(id).orElse(null);
    }

    public String deleteQuizAnswer(int id) {
        quizAnswerRepository.deleteById(id);
        return "Quiz Question deleted: " + id;
    }

}
