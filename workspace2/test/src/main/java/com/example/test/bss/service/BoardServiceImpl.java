package com.example.test.bss.service;

import com.example.test.bss.repositry.BoardRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepositoryImpl boardRepo;
}
