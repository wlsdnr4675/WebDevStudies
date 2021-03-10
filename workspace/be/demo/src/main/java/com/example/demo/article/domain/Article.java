package com.example.demo.article.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    private long articleNo;
    private long userNo;
    private String title;
    private String content;
    private String regdate;

}
