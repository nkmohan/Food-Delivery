package com.mohanit.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mohanit.binding.Order;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    private static final String TOPIC = "order_topic";

    public String placeOrder(Order order) {
        // Set the order time dynamically
        order.setOrderTime(LocalDateTime.now());

        // Produce the order event
        kafkaTemplate.send(TOPIC, order);
        return "Order placed successfully!";
    }
}
