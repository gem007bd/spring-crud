package com.crud.spring.springbootcrudapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DateFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String userName;
    private String email;
    private String passwordHash;
    private int host;
    private DateFormat registeredAt;
    private DateFormat lastLogin;
    private int introduction;
    private Boolean status;
    private String profile;
}
