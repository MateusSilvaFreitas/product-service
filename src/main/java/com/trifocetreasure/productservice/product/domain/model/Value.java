package com.trifocetreasure.productservice.product.domain.model;

import java.math.BigDecimal;

public record Value(BigDecimal value) {
    public Value(BigDecimal value){
        this.value = value;
        validateValue(value);
    }
    private static void validateValue(BigDecimal value){
        if(value.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Value must be positive");
        }
    }
}