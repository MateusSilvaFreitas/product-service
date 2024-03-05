package com.trifocetreasure.productservice.product.infrastructure.spring.repository;


import com.trifocetreasure.productservice.product.domain.model.Product;
import org.springframework.data.repository.Repository;

public interface ProductSpringRepository extends Repository<Product, Long> {
    <S extends Product> S save(S entity);
}