package com.studycode.jnews.job;

import com.studycode.jnews.model.News;
import com.studycode.jnews.service.NewsService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;

@Service
public class ParseTask {
    @Autowired
    private NewsService service;

    @Scheduled(fixedDelay = 10000)
    public void parseNewNews() {
        System.out.println("Begin parse");
        String url = "https://russian.rt.com/";

        Document document = null;
        try {
            document = Jsoup.connect(url)
                    .userAgent("Mozzila")
                    .timeout(5000)
                    .referrer("https://google.com")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements news = document != null ? document.getElementsByClass("link link_color ") : new Elements();
        for (Element e : news) {
            String title = e.ownText();
            if (!service.isExist(title)) {
                News n = new News().setTitle(title);
                service.save(n);
            }
        }
    }
}
