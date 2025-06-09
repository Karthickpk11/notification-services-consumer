package com.notification.service.notification_services_consumer.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageReader {

    @KafkaListener(topics = "notification-topic", groupId = "consumer-group")
    public void consume(String message) {
        System.out.println("Consuming from Kafka topic : " + message);
    }
}
