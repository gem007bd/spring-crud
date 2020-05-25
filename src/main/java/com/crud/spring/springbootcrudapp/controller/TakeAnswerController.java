package com.crud.spring.springbootcrudapp.controller;

import com.crud.spring.springbootcrudapp.entity.TakeAnswer;
import com.crud.spring.springbootcrudapp.service.TakeAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TakeAnswerController {

    @Autowired
    private TakeAnswerService takeAnswerService;

    @PostMapping("/addTakeAnswer")
    public TakeAnswer addUser(@RequestBody TakeAnswer takeAnswer) {
        return takeAnswerService.saveTakeAnswer(takeAnswer);
    }

    @PostMapping("/addTakeAnswerAll")
    public List<TakeAnswer> addTakeAll(@RequestBody List<TakeAnswer> takeAnswers) {
        return takeAnswerService.saveTakeAnswerAll(takeAnswers);
    }

    @GetMapping("/takeAnswerAll")
    public List<TakeAnswer> findTakeAnswerAll() {
        return takeAnswerService.getTakeAnswerAll();
    }

    @GetMapping("takeAnswerById/{id}")
    public TakeAnswer findTakeAnswerById(@PathVariable int id) {
        return takeAnswerService.getTakeAnswerById(id);
    }


    @DeleteMapping("/deleteTakeAnswer/{id}")
    public String deleteTakeAnswer(@PathVariable int id) {
        return takeAnswerService.deleteTakeAnswer(id);
    }

}
