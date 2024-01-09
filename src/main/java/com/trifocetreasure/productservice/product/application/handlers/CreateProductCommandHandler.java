package com.trifocetreasure.productservice.product.application.handlers;

import com.trifocetreasure.productservice.product.application.commands.CreateProductCommand;
import com.trifocetreasure.productservice.product.domain.model.Product;
import com.trifocetreasure.productservice.product.domain.model.Value;
import com.trifocetreasure.productservice.product.infrastructure.jwt.JwtContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductCommandHandler {

    @Autowired
    JwtContext jwtContext;

    public void handle(CreateProductCommand createProductCommand){
        Product product = Product.builder()
                .name(createProductCommand.name())
                .description(createProductCommand.description())
                .value(new Value(createProductCommand.value()))
                .quantity(createProductCommand.quantity())
                .productImages(createProductCommand.productImages())
                .build();


    }
}
