package com.lnu.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  @KafkaListener(topics = {"pravda"}, groupId = "mygroup")
  public void consumeFromTopic(String message) {
    System.out.println("Consumed message " + message);
  }

}
