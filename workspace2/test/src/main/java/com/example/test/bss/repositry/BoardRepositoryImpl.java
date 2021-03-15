package com.example.test.bss.repositry;

import java.util.List;

import com.example.test.bss.domain.BoardDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.java.Log;

@Repository
@Log
public class BoardRepositoryImpl /* implements BoardRepository */ {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BoardDto> list() throws Exception {
    log.info("list ()");

    List<BoardDto> results = jdbcTemplate.query("select board_no, title, content,
    writer, " + "reg_date from boards where board_no > 0 " + "order by board_no desc,
    reg_date desc",
    );
    }
}
