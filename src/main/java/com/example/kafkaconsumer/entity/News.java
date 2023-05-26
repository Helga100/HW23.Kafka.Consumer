package com.example.kafkaconsumer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "news")

public class News {
    @Id
    @GeneratedValue
    private Long id;
    private String newsInfo;
    private boolean hotNews;


    public News(String newsInfo, boolean hotNews) {
        this.newsInfo = newsInfo;
        this.hotNews = hotNews;
    }

    public News() {
    }
}
