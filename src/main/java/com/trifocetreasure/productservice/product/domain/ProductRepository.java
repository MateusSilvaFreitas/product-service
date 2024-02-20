package com.trifocetreasure.productservice.product.domain;

import com.trifocetreasure.productservice.product.domain.model.Product;

public interface ProductRepository {
    void insert(Product product);

    void update(Product product);
}
