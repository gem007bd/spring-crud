package com.crud.spring.springbootcrudapp.repository;

import com.crud.spring.springbootcrudapp.entity.Take;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TakeRepository extends JpaRepository<Take, Integer> {

}
