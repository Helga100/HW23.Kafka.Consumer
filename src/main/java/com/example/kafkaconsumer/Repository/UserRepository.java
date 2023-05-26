package com.example.kafkaconsumer.Repository;

import com.example.kafkaconsumer.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
