package com.ecommerce_microservices.notification.entities;

public record Customer(
        String id,
        String firstName,
        String lastName,
        String email
) {}
