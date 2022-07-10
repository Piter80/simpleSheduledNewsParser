package com.studycode.jnews.controller;

import com.studycode.jnews.model.News;
import com.studycode.jnews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/")
    public List<News> getAllNews() {
        return  newsService.getAllNews();
    }
}
