package com.example.demo.bbs.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Board {
    private long boardNo;
    private long userNo;
    private String boardname;

}
