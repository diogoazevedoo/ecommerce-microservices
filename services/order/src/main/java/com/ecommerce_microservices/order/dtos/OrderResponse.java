package com.ecommerce_microservices.order.dtos;

import com.ecommerce_microservices.order.entities.PaymentMethod;

import java.math.BigDecimal;

public record OrderResponse(
        Integer id,
        String reference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerId
) {}
