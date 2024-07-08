package com.ecommerce_microservices.order.repositories;

import com.ecommerce_microservices.order.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {}
