package com.example.demo.bbs.repository;

import com.example.demo.bbs.domain.Board;

import org.springframework.data.jpa.repository.JpaRepository;

interface BoardCustomRepository {

}

public interface BoardRepository extends JpaRepository<Board, Long>, BoardCustomRepository {

}
