package com.jinwook.api.article.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    private long articleId;
    @Column(name = "writer")
    private String writer;
    @Column(name = "email")
    private String email;
    @Column(name = "subject")
    private String subject;
    @Column(name = "content")
    private String content;
    @Column(name = "rdate")
    private String rdate;
}
