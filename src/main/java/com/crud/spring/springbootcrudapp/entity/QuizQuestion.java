package com.crud.spring.springbootcrudapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DateFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class QuizQuestion {
    @Id
    @GeneratedValue
    private int id;
    private String type;
    private boolean active;
    private int level;
    private int score;
    private DateFormat createdAt;
    private DateFormat updateAt;
    private String content;
}
