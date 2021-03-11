package com.example.demo.bbs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "boards")
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_no")
    private long boardNo;
    @Column(name = "user_no")
    private long userNo;
    @Column(name = "board_name")
    private String boardName;

}
