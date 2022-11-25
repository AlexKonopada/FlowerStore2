package com.example.flowerstore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowerAppConfig {

    @Bean
    public String getData() {
        return "hello, world";
    }
}
