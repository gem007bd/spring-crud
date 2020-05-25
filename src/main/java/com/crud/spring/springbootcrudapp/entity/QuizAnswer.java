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
public class QuizAnswer {
    @Id
    @GeneratedValue
    private int id;
    private int quizId;
    private int questionId;
    private boolean active;
    private boolean correct;
    private DateFormat createdAt;
    private DateFormat updateAt;
    private String content;
}
