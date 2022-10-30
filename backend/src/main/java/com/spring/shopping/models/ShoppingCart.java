package com.spring.shopping.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String userId;

    @OneToMany(mappedBy = "cart",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<OrderItem> items = new HashSet<>();
}
