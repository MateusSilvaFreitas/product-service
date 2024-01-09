package com.trifocetreasure.productservice.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private String description;
    private Value value;
    private Integer quantity;
    private List<String> productImages;
    //TODO: add the store reference

    public Product(String name, String description, Value value, Integer quantity, List<String> productImages) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.value = value;
        this.quantity = quantity;
        this.productImages = productImages;
    }
}