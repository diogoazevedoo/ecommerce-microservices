package com.ecommerce_microservices.customer.dtos;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {}
