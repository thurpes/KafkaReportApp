package com.thurpe.KafkaReportApp.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

public class KafkaConsumer {

    @KafkaListener(topics = "New Orders", groupId = "group_id")
    @KafkaListener(topics = "Filter", groupId = "group_id")

    // Method
    public void
    consume(String message)
    {
        // Print statement
        System.out.println("message = " + message);
    }
}