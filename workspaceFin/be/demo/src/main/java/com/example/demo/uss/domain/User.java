package com.example.demo.uss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_no")
    @GeneratedValue
    private long userNo;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "gender")
    private String gender;

    @Column(name = "regdate")
    private String regdate;

    @Builder
    public User(String name, String username, String password, String email, String birthday, String gender,
            String regdate) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.regdate = regdate;
    }

}
