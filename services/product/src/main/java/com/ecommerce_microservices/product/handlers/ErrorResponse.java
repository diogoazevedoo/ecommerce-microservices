package com.ecommerce_microservices.product.handlers;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {}
