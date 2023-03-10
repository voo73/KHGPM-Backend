package com.example.demo.domain.productBoard.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class ProductBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    // length 글자길이 nullable=널이 될수 없다. int는 음수가 되기 때문에 long형으로 지정
    @Column(length = 128, nullable = false)
    private String title;

    @Column(length = 32, nullable = false)
    private int price;

    @Column(length = 32, nullable = false)
    private String writer;

    @Column(length = 32, nullable = false)
    private String delivery;

    @CreationTimestamp
    private Date regDate;

}
