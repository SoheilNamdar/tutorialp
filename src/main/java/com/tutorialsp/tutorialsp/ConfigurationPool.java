package com.tutorialsp.tutorialsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationPool {

    @Bean
    Product product() {
        return new Product();
    }
}
