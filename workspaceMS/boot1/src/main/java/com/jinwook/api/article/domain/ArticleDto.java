package com.jinwook.api.article.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ArticleDto {

    private long articleId;
    private String writer;
    private String email;
    private String subject;
    private String content;
    private String rdate;

}
