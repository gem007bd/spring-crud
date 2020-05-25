package com.crud.spring.springbootcrudapp.controller;

import com.crud.spring.springbootcrudapp.entity.Take;
import com.crud.spring.springbootcrudapp.service.TakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TakeController {

    @Autowired
    private TakeService takeService;

    @PostMapping("/addTake")
    public Take addUser(@RequestBody Take take) {
        return takeService.saveTake(take);
    }

    @PostMapping("/addTakeAll")
    public List<Take> addTakeAll(@RequestBody List<Take> takes) {
        return takeService.saveTakeAll(takes);
    }

    @GetMapping("/takeAll")
    public List<Take> findAllTake() {
        return takeService.getTakeAll();
    }

    @GetMapping("takeById/{id}")
    public Take findtakeById(@PathVariable int id) {
        return takeService.getTakeById(id);
    }


    @DeleteMapping("/deleteTake/{id}")
    public String deleteTake(@PathVariable int id) {
        return takeService.deleteTake(id);
    }

}
