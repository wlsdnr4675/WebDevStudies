package com.jinwook.api.board.controller;

import com.jinwook.api.board.service.BoardServiceImpl;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private BoardServiceImpl service;
}
