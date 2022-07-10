package com.studycode.jnews.service;

import com.studycode.jnews.model.News;
import com.studycode.jnews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository repository;

    @Override
    public void save(News news) {
        repository.save(news);
    }

    @Override
    public boolean isExist(String newsTitle) {
        return repository.getByTitle(newsTitle) != null;
    }

    @Override
    public List<News> getAllNews() {
        return repository.findAll();
    }
}
