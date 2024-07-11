package com.ecommerce_microservices.order.mappers;

import com.ecommerce_microservices.order.dtos.OrderLineRequest;
import com.ecommerce_microservices.order.dtos.OrderLineResponse;
import com.ecommerce_microservices.order.entities.Order;
import com.ecommerce_microservices.order.entities.OrderLine;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.id())
                .quantity(request.quantity())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .productId(request.productId())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}
