package com.board.projectboard.domain;

import java.time.LocalDateTime;

public class Article {

    private Long articleId;
    private String title;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
