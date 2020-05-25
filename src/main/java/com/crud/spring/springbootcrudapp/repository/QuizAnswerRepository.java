package com.crud.spring.springbootcrudapp.repository;

import com.crud.spring.springbootcrudapp.entity.QuizAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizAnswerRepository extends JpaRepository<QuizAnswer, Integer> {
}
