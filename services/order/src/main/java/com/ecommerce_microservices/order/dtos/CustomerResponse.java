package com.ecommerce_microservices.order.dtos;

public record CustomerResponse(
        String id,
        String firstName,
        String lastName,
        String email
) {}
