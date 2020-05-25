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
public class Take {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private int quizId;
    private boolean status;
    private int score;
    private boolean published;
    private DateFormat createdAt;
    private DateFormat updateAt;
    private DateFormat startedAt;
    private DateFormat finishedAt;
    private String content;
}
