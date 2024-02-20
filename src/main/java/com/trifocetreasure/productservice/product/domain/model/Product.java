package com.trifocetreasure.productservice.product.domain.model;

import com.trifocetreasure.productservice.product.application.commands.CreateProductCommand;
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

    public static Product createByCommand(CreateProductCommand createProductCommand) {
        return Product.builder()
                .id(UUID.randomUUID().toString())
                .name(createProductCommand.name())
                .description(createProductCommand.description())
                .value(new Value(createProductCommand.value()))
                .quantity(createProductCommand.quantity())
                .productImages(createProductCommand.productImages())
                .build();
    }
}