package com.example.test.bss.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.test.bss.domain.BoardDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import lombok.extern.java.Log;

@Repository
@Log
public class BoardRepositoryImpl /* implements BoardRepository */ {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BoardDto> list() throws Exception {
        log.info("list()");

        List<BoardDto> results = jdbcTemplate.query(
                "select board_no, title, content, writer, " + "reg_date from board where board_no > 0 "
                        + "order by board_no desc, reg_date desc",

                new RowMapper<BoardDto>() {
                    @Override
                    public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                        BoardDto board = new BoardDto();
                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setRegDate(rs.getDate("reg_date"));

                        return board;
                    }
                });

        return results;
    }

    public void create(BoardDto board) throws Exception {
        log.info("create()");

        // alter table board convert to charset utf8;
        // 한글 처리 안 될 경우
        String query = "insert into board(title, content, writer) " + "values(?, ?, ?)";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }

    public BoardDto read(Integer boardNo) throws Exception {
        List<BoardDto> results = jdbcTemplate.query(
                "select board_no, title, content, writer, reg_date " + "from board where board_no = ?",

                new RowMapper<BoardDto>() {
                    @Override
                    public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                        BoardDto board = new BoardDto();
                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setRegDate(rs.getDate("reg_date"));

                        return board;
                    }
                }, boardNo);

        return results.isEmpty() ? null : results.get(0);
    }

    public void remove(Integer boardNo) throws Exception {
        String query = "delete from board where board_no =?";

        jdbcTemplate.update(query, boardNo);
    }

    public void modify(BoardDto board) throws Exception {
        String query = "update board set title = ?, content = ? " + "where board_no = ?";
        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getBoardNo());
    }
}