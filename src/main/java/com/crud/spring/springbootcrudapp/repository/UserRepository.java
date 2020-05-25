package com.crud.spring.springbootcrudapp.repository;

import com.crud.spring.springbootcrudapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
    User findAllByEmail(String email);
}
