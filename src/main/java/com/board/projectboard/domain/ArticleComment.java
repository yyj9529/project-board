package com.board.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long articleId;
    private String title; //제목
    private String hashtag;  

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
