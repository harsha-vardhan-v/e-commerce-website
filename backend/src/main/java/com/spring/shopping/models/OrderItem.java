package com.spring.shopping.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    private String id;

    @OneToOne
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cart_id", nullable = false)
    @JsonIgnore
    private ShoppingCart cart;

    private int quantity;

    private  void fromDto(Product p, ShoppingCart cart, int quantity) {
        id = UUID.randomUUID().toString().replace("-", "");
        product = p;
        this.cart = cart;
        this.quantity = quantity;
    }
}
