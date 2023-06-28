package com.microservices.usermanagement.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
        // Process the received message
    }
}
