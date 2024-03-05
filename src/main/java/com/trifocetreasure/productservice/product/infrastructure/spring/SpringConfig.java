package com.trifocetreasure.productservice.product.infrastructure.spring;

import com.trifocetreasure.productservice.product.domain.ProductRepository;
import com.trifocetreasure.productservice.product.infrastructure.spring.repository.ProductSpringRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Autowired
    ProductSpringRepositoryImpl productSpringRepositoryImpl;

    @Bean
    public ProductRepository productRepository() {
        return productSpringRepositoryImpl;
    }
}
