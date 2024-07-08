package com.ecommerce_microservices.order.dtos;

import java.math.BigDecimal;

public record PurchaseResponse(
        Integer productId,
        String name,
        String description,
        BigDecimal price,
        Double quantity
) {}
