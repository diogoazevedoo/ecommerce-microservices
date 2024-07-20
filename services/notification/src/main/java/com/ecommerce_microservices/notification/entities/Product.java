package com.ecommerce_microservices.notification.entities;

import java.math.BigDecimal;

public record Product(
        Integer productId,
        String name,
        String description,
        BigDecimal price,
        Double quantity
) {}
