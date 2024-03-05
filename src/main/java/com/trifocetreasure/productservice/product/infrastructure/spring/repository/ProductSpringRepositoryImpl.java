package com.trifocetreasure.productservice.product.infrastructure.spring.repository;


import com.trifocetreasure.productservice.product.domain.ProductRepository;
import com.trifocetreasure.productservice.product.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductSpringRepositoryImpl implements ProductRepository {

    @Autowired
    ProductSpringRepository productSpringRepository;

    @Override
    public void insert(Product product) {
        productSpringRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productSpringRepository.save(product);
    }
}
