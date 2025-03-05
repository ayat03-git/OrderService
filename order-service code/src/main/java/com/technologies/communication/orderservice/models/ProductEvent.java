package com.technologies.communication.orderservice.models;

import lombok.*;


@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class ProductEvent {
    private Long id;
    private Long orderId;
    private ProductStatus status;
}


