package com.example.kafkaconsumer.service;

import com.example.kafkaconsumer.Repository.NewsRepository;
import com.example.kafkaconsumer.entity.News;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public News createnews(String news) {
        boolean n = news.startsWith("n");
        News newsAsEntity = new News(news, n);
        return newsRepository.save(newsAsEntity);
    }

}
