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
public class Quiz {
    @Id
    @GeneratedValue
    private int id;
    private int hostId;
    private String title;
    private String metaTitle;
    private String slug;
    private int summary;
    private int type;
    private int score;
    private int published;
    private DateFormat createdAt;
    private DateFormat updateAt;
    private DateFormat publishedAt;
    private DateFormat startsAt;
    private DateFormat endsAt;
    private String content;
}
