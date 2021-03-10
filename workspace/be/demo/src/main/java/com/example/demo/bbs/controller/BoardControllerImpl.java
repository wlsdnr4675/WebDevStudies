package com.example.demo.bbs.controller;

import com.example.demo.bbs.domain.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardControllerImpl implements BoardController {
    @Autowired
    Board board;

    public void test() {
        board.getBoardNo();
        board.getBoardName();
    }

}
