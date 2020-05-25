package com.crud.spring.springbootcrudapp.repository;

import com.crud.spring.springbootcrudapp.entity.QuizMeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizMetaRepository extends JpaRepository<QuizMeta, Integer> {
}
