package com.cardinalhealth.nphs_consumer_app;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics= {"nphs_isotrac_sample"}, groupId="spring-boot-kafka")
    public void consume(String quote) {
        System.out.println("received= " + quote);
    }
}
