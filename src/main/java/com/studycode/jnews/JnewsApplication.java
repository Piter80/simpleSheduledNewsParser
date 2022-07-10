package com.studycode.jnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@ComponentScan(basePackages =  "com.studycode.jnews.")
public class JnewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JnewsApplication.class, args);
    }

}
