package com.jinwook.api.board.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
public class BoardDto {
    private long boardNo;
    private String title;

}
