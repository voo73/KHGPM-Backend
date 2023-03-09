package com.example.demo.domain.product.controller.request;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Lob;

@Getter
public class ProductRequest {

    private Long productNo;
    private String name;
    private Long price;
    private String writer;
    private String content;
    private Long views;

}