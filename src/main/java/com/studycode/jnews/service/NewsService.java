package com.studycode.jnews.service;

import com.studycode.jnews.model.News;

import java.util.List;

public interface NewsService {
    void save (News news);
    boolean isExist (String newsTitle);
    List<News> getAllNews();
}
