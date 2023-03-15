package com.example.demo.domain.product.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RequestProductInfo {

    // 상품 정보를 요청하기 위한 객체

    final private String productName;
    final private String writer;
    final private String content;
    final private Integer price;
}