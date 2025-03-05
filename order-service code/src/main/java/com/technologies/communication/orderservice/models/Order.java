package com.technologies.communication.orderservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    private int quantity;

    @Column(name = "total_price")
    private double totalPrice;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}

