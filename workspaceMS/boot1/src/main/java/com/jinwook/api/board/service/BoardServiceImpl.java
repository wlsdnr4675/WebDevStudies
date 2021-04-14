package com.jinwook.api.board.service;

import com.jinwook.api.board.repository.BoardRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private BoardRepository repo;

}
