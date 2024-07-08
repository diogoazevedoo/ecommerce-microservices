package com.ecommerce_microservices.order.repositories;

import com.ecommerce_microservices.order.entities.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {}
