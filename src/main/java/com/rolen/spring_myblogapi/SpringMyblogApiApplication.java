package com.rolen.spring_myblogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // domain.Article >> created_at, updated_at 자동 업데이트
@SpringBootApplication
public class SpringMyblogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMyblogApiApplication.class, args);
    }

}
