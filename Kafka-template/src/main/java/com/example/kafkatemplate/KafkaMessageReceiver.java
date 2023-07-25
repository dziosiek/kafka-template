package com.example.kafkatemplate;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageReceiver {

    @KafkaListener(topics = "thing1", groupId = "group_id")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}