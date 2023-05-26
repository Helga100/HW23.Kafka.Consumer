package com.example.kafkaconsumer.Repository;

import com.example.kafkaconsumer.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}
