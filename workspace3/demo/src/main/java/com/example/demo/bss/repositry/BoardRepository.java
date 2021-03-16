package com.example.demo.bss.repositry;

import com.example.demo.bss.domain.Board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
