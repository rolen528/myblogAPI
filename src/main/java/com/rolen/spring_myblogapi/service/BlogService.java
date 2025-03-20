package com.rolen.spring_myblogapi.service;

import com.rolen.spring_myblogapi.domain.Article;
import com.rolen.spring_myblogapi.dto.AddArticleRequest;
import com.rolen.spring_myblogapi.dto.UpdateArticleRequest;
import com.rolen.spring_myblogapi.repository.BlogRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService    {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
    
    // DB에 저장되어 있는 글의 ID를 이용하여 글 조회
    public Article findById(Long id) {
        return blogRepository.findById(id) // findById() : JPA에서 제공
                .orElseThrow(() -> new IllegalArgumentException("not found" + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found" + id));
        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
