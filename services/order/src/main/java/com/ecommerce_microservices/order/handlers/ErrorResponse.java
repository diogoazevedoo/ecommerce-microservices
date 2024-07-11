package com.ecommerce_microservices.order.handlers;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {}
