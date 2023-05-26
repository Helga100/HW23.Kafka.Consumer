package com.example.kafkaconsumer.service;

import com.example.kafkaconsumer.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final NewsService newsService;
    private final UserService userService;

    @KafkaListener(topics = "news1", groupId = "1")
    public void consumeFromTopicNews1(String message) {
        System.out.println("From Topic news1" + message);
        newsService.createnews(message);
           }

    @KafkaListener(topics = "user1", groupId = "1")
    public void consumeFromTopicUser1(String message) {
        System.out.println("From Topic user1" + message);
        userService.createUser(message);

    }

    @KafkaListener(topics = "news2", groupId = "1")
    public void consumeFromTopicNews2(String message) {
        System.out.println("From Topic news2" + message);
        newsService.createnews(message);
          }

    @KafkaListener(topics = "user2", groupId = "1")
    public void consumeFromTopicUser2(String message) {
        System.out.println("From Topic user2" + message);
        userService.createUser(message);
    }

}
