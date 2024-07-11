package com.ecommerce_microservices.payment.repositories;

import com.ecommerce_microservices.payment.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {}
