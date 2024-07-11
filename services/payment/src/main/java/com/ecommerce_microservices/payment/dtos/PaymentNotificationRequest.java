package com.ecommerce_microservices.payment.dtos;

import com.ecommerce_microservices.payment.entities.PaymentMethod;

import java.math.BigDecimal;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstName,
        String customerLastName,
        String customerEmail
) {}
