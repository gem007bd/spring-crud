package com.crud.spring.springbootcrudapp.service;

import com.crud.spring.springbootcrudapp.entity.Take;
import com.crud.spring.springbootcrudapp.repository.TakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakeService {

    @Autowired
    private TakeRepository takeRepository;

    public Take saveTake(Take take) {
        return takeRepository.save(take);
    }

    public List<Take> saveTakeAll(List<Take> takes) {
        return takeRepository.saveAll(takes);
    }

    public List<Take> getTakeAll() {
        return takeRepository.findAll();
    }

    public Take getTakeById(int id) {
        return takeRepository.findById(id).orElse(null);
    }

    public String deleteTake(int id) {
        takeRepository.deleteById(id);
        return "Take deleted: " + id;
    }

}
