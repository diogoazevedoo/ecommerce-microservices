package com.ecommerce_microservices.order.dtos;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        Double quantity
) {}
