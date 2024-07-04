package com.ecommerce_microservices.customer.handlers;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {}
