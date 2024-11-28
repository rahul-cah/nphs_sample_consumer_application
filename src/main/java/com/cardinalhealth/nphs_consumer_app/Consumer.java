package com.cardinalhealth.nphs_consumer_app;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics= {"NPHS_ISOTRAC_INVOICE"}, groupId="isotrac_invoice")
    public void consume(String quote) {
        System.out.println("received= " + quote);
    }
}
