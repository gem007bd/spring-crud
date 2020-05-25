package com.crud.spring.springbootcrudapp.service;

import com.crud.spring.springbootcrudapp.entity.TakeAnswer;
import com.crud.spring.springbootcrudapp.repository.TakeAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakeAnswerService {

    @Autowired
    private TakeAnswerRepository takeAnswerRepository;

    public TakeAnswer saveTakeAnswer(TakeAnswer takeAnswer) {
        return takeAnswerRepository.save(takeAnswer);
    }

    public List<TakeAnswer> saveTakeAnswerAll(List<TakeAnswer> takeAnswers) {
        return takeAnswerRepository.saveAll(takeAnswers);
    }

    public List<TakeAnswer> getTakeAnswerAll() {
        return takeAnswerRepository.findAll();
    }

    public TakeAnswer getTakeAnswerById(int id) {
        return takeAnswerRepository.findById(id).orElse(null);
    }

    public String deleteTakeAnswer(int id) {
        takeAnswerRepository.deleteById(id);
        return "TakeAnswer deleted: " + id;
    }

}
