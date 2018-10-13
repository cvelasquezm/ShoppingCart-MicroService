package com.udea.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.udea.cart.json.JsonConvert;
import com.udea.cart.model.Cart;
	
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;


    @Value("${topic.CheckedOut}")
    private String topic;

    Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishEvent(Cart cart) {
        try {
            this.kafkaTemplate.send(topic, JsonConvert.objectJson(cart));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
	
	
}
