package com.ecommerce_microservices.payment.dtos;

import com.ecommerce_microservices.payment.entities.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        Integer id,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        Customer customer
) {}
