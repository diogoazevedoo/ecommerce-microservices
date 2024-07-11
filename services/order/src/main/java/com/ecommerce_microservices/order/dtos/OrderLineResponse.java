package com.ecommerce_microservices.order.dtos;

public record OrderLineResponse(
        Integer id,
        Double quantity
) {}
