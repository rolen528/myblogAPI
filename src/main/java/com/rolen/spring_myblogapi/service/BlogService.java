package com.rolen.spring_myblogapi.service;

import com.rolen.spring_myblogapi.domain.Article;
import com.rolen.spring_myblogapi.dto.AddArticleRequest;
import com.rolen.spring_myblogapi.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService    {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
