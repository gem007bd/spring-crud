package com.crud.spring.springbootcrudapp.repository;

import com.crud.spring.springbootcrudapp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
