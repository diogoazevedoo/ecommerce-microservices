package com.ecommerce_microservices.order.mappers;

import com.ecommerce_microservices.order.dtos.OrderRequest;
import com.ecommerce_microservices.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderMapper {
    public Order toOrder(OrderRequest request) {
        return Order.builder()
                .id(request.id())
                .customerId(request.customerId())
                .reference(request.reference())
                .totalAmount(request.amount())
                .paymentMethod(request.paymentMethod())
                .build();
    }
}
