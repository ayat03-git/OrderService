package com.technologies.communication.orderservice.repositories;

import com.technologies.communication.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}



