package com.example.demo.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    public CustomEndpoint customEndpoint() {
        return new CustomEndpoint();
    }
}
