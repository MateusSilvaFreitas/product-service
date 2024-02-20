package com.trifocetreasure.productservice.product.application.handlers;

public interface CommandHandler<C>{
    void handle(C command);
}
