package com.trifocetreasure.productservice.product.infrastructure.spring;

import com.trifocetreasure.productservice.product.domain.ProductRepository;
import com.trifocetreasure.productservice.product.infrastructure.spring.repository.ProductSpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Autowired
    ProductSpringRepository productSpringRepository;

    @Bean
    public ProductRepository productRepository() {
        return productSpringRepository;
    }
}
