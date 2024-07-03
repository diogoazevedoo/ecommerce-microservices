package com.ecommerce_microservices.customer.dtos;

import com.ecommerce_microservices.customer.domain.Address;

public record CustomerResponse(
        String id,
        String firstName,
        String lastName,
        String email,
        Address address
) {}
