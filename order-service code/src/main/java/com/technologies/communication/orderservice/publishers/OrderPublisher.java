package com.technologies.communication.orderservice.publishers;

import com.technologies.communication.orderservice.models.OrderEvent;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderPublisher {
    private final StreamBridge streamBridge;

    public OrderPublisher(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void publish(OrderEvent order) {
        streamBridge.send("order-output", order);
    }
}

