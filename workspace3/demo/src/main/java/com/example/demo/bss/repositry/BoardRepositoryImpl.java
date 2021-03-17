package com.example.demo.bss.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.demo.bss.domain.BoardDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import lombok.extern.java.Log;

@Repository
@Log
public class BoardRepositoryImpl /* implements BoardRepository */ {
    public long count() {
        return 0;
    }

}