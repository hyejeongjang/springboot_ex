package com.springboot_ex.domain.posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
public class Posts { // 엔티티 클래스
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increasement
    private Long id;

    @Column(length=500, nullable = false)
    private String title; // 제목

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content; // 내용

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title=title;
        this.content=content;
        this.author=author;
    }


}
