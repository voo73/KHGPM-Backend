package com.example.demo.domain.board.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
//java 클래스가 JPA 엔티티임을 나타내는 주석
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue : 엔티티 기본 키값을 생성하는 방법지정 ,
    // IDENTITY : 주석이 추가되면 JPA가 데이터 베이스에 지속되는 해당 엔티티의 각 새 인스턴스에
    //대해 고유한 기본 키 값을 자동으로 생성

    private Long boardId;

    @Column(length = 128, nullable = false)
    // 열의 길이, null 값을 할당 할 수 없음(false)
    private String title;

    @Column(length = 32, nullable = false)
    private String writer;

    @Lob
    private String content;

    @CreationTimestamp
    private Date regDate;

    @UpdateTimestamp
    private Date updDate;
}