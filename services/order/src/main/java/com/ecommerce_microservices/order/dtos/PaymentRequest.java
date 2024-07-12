package com.ecommerce_microservices.order.dtos;

import com.ecommerce_microservices.order.entities.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {}
