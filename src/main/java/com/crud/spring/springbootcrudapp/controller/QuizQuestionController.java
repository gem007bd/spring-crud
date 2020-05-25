package com.crud.spring.springbootcrudapp.controller;

import com.crud.spring.springbootcrudapp.entity.QuizQuestion;
import com.crud.spring.springbootcrudapp.service.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizQuestionController {

    @Autowired
    private QuizQuestionService quizQuestionService;

    @PostMapping("/addQuizQuestion")
    public QuizQuestion addQuizQuestion(@RequestBody QuizQuestion quizQuestion) {
        return quizQuestionService.saveQuizQuestion(quizQuestion);
    }

    @PostMapping("/addQuizQuestions")
    public List<QuizQuestion> addQuizQuestions(@RequestBody List<QuizQuestion> quizQuestions) {
        return quizQuestionService.saveQuizQuestionAll(quizQuestions);
    }

    @GetMapping("/quizQuestions")
    public List<QuizQuestion> findAllQuizQuestions() {
        return quizQuestionService.getQuizQuestionAll();
    }

    @GetMapping("quizQuestionById/{id}")
    public QuizQuestion findQuizQuestionById(@PathVariable int id) {
        return quizQuestionService.getQuizQuestionById(id);
    }

    @DeleteMapping("/deleteQuizQuestion/{id}")
    public String deleteQuizQuestion(@PathVariable int id) {
        return quizQuestionService.deleteQuizQuestion(id);
    }

}
