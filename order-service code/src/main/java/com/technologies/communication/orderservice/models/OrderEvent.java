package com.technologies.communication.orderservice.models;


import lombok.*;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OrderEvent {
    private Long id;
    private Long productId;
    private int quantity;
}



