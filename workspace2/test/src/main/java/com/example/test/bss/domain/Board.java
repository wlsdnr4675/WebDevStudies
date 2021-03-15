package com.example.test.bss.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "boards")
public class Board {
    @Id
    @GeneratedValue
    @Column
    private long boardNo;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String writer;
    @Column
    private Date regDate;

}
