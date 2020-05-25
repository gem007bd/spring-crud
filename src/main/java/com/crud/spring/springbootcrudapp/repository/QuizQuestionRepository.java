package com.crud.spring.springbootcrudapp.repository;


import com.crud.spring.springbootcrudapp.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Integer> {
}
