package com.rolen.spring_myblogapi.repository;

import com.rolen.spring_myblogapi.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> { // Aritcle의 PK 타입 = Long
}
