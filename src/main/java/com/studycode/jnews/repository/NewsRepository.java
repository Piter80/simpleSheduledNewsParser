package com.studycode.jnews.repository;

import com.studycode.jnews.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    News getByTitle(String title);

    boolean existsByTitle(String title);
}
