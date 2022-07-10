package com.studycode.jnews.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class News {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String title;
}
