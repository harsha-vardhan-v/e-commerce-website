package com.spring.shopping.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    public enum sex {
        MALE,
        FEMALE
    }

    @Id
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    sex productSex;
    @Column(name = "dresstype")
    String dressType;
    @Column(name = "image")
    String image;
    @Column(name = "price")
    String price;
    @Column(name = "arrival")
    String arrival;
    @Column(name = "discount")
    int discount;
}
