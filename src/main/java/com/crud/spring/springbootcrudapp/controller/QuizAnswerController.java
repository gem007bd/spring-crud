package com.crud.spring.springbootcrudapp.controller;

import com.crud.spring.springbootcrudapp.entity.QuizAnswer;
import com.crud.spring.springbootcrudapp.service.QuizAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizAnswerController {

    @Autowired
    private QuizAnswerService quizAnswerService;

    @PostMapping("/addQuizAnswer")
    public QuizAnswer addQuizAnswer(@RequestBody QuizAnswer quizAnswer) {
        return quizAnswerService.saveQuizAnswer(quizAnswer);
    }

    @PostMapping("/addQuizAnswers")
    public List<QuizAnswer> addQuizAnswers(@RequestBody List<QuizAnswer> quizAnswers) {
        return quizAnswerService.saveQuizAnswers(quizAnswers);
    }

    @GetMapping("/quizAnswers")
    public List<QuizAnswer> findQuizAnswers() {
        return quizAnswerService.getQuizAnswers();
    }

    @GetMapping("quizAnswerById/{id}")
    public QuizAnswer findQuizAnswerById(@PathVariable int id) {
        return quizAnswerService.getQuizAnswerById(id);
    }

    @DeleteMapping("/deleteQuizAnswer/{id}")
    public String deleteQuizAnswer(@PathVariable int id) {
        return quizAnswerService.deleteQuizAnswer(id);
    }

}
