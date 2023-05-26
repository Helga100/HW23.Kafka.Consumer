package com.example.kafkaconsumer.service;

import com.example.kafkaconsumer.Repository.UserRepository;
import com.example.kafkaconsumer.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(String name) {
        User userAsObject = new User(name);
        return userRepository.save(userAsObject);
    }
}
