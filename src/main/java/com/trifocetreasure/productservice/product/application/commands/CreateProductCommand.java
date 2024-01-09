package com.trifocetreasure.productservice.product.application.commands;

import java.math.BigDecimal;
import java.util.List;

public record CreateProductCommand(String name,
                                   String description,
                                   BigDecimal value,
                                   Integer quantity,
                                   List<String> productImages) {
}
