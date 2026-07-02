package com.example.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorConfig {

    @Bean
    AuditorAware<String> auditorProvider() {

        return new AuditorAware<String>() {

            @Override
            public Optional<String> getCurrentAuditor() {

                return Optional.of("Seenu");

            }

        };

    }

}