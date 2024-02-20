package com.trifocetreasure.productservice.product.application.handlers;

import com.trifocetreasure.productservice.product.application.commands.CreateProductCommand;
import com.trifocetreasure.productservice.product.domain.ProductRepository;
import com.trifocetreasure.productservice.product.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductCommandHandler implements CommandHandler<CreateProductCommand>{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void handle(CreateProductCommand createProductCommand){
        Product product = Product.createByCommand(createProductCommand);
        productRepository.insert(product);
    }
}
