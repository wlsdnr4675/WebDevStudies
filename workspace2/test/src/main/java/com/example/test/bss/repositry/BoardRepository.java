package com.example.test.bss.repositry;

import com.example.test.bss.domain.Board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
