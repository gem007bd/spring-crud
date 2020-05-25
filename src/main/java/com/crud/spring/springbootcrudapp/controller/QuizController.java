package com.crud.spring.springbootcrudapp.controller;

import com.crud.spring.springbootcrudapp.entity.Quiz;
import com.crud.spring.springbootcrudapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/addQuiz")
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return quizService.saveQuiz(quiz);
    }

    @PostMapping("/addQuizzes")
    public List<Quiz> addQuizzes(@RequestBody List<Quiz> quizzes) {
        return quizService.saveQuizAll(quizzes);
    }

    @GetMapping("/quizzes")
    public List<Quiz> findAllQuiz() {
        return quizService.getQuizAll();
    }

    @GetMapping("quizById/{id}")
    public Quiz findQuizById(@PathVariable int id) {
        return quizService.getQuizById(id);
    }

    @DeleteMapping("/deleteQuiz/{id}")
    public String deleteQuiz(@PathVariable int id) {
        return quizService.deleteQuiz(id);
    }

}
