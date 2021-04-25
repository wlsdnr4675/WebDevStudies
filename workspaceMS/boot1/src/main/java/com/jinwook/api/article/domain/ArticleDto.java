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

    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getWriter(){
        return this.writer;
    }

    public String toString(){
        return this.writer;
    }

}
