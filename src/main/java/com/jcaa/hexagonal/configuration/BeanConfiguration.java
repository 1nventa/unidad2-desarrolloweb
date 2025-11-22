package com.jcaa.hexagonal.configuration;


import com.jcaa.hexagonal.core.port.EnfermedadRepositoryPort;
import com.jcaa.hexagonal.core.port.EnfermedadServicePort;
import com.jcaa.hexagonal.core.service.EnfermedadService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public EnfermedadServicePort enfermedadServicePort(EnfermedadRepositoryPort repo) {
        return new EnfermedadService(repo);
    }
}