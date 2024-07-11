package com.ecommerce_microservices.payment.services;

import com.ecommerce_microservices.payment.dtos.PaymentNotificationRequest;
import com.ecommerce_microservices.payment.dtos.PaymentRequest;
import com.ecommerce_microservices.payment.entities.Payment;
import com.ecommerce_microservices.payment.mappers.PaymentMapper;
import com.ecommerce_microservices.payment.producers.NotificationProducer;
import com.ecommerce_microservices.payment.repositories.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    private final NotificationProducer notificationProducer;

    public Integer createPayment(PaymentRequest request) {
        var payment = paymentRepository.save(paymentMapper.toPayment(request));
        notificationProducer.sendNotification(
                new PaymentNotificationRequest(
                        request.orderReference(),
                        request.amount(),
                        request.paymentMethod(),
                        request.customer().firstName(),
                        request.customer().lastName(),
                        request.customer().email()
                )
        );
        return payment.getId();
    }
}
