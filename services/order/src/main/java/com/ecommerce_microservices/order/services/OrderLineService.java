package com.ecommerce_microservices.order.services;

import com.ecommerce_microservices.order.dtos.OrderLineRequest;
import com.ecommerce_microservices.order.mappers.OrderLineMapper;
import com.ecommerce_microservices.order.repositories.OrderLineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderLineService {
    private final OrderLineRepository orderLineRepository;
    private final OrderLineMapper orderLineMapper;

    public Integer saveOrderLine(OrderLineRequest request) {
        var order = orderLineMapper.toOrderLine(request);
        return orderLineRepository.save(order).getId();
    }
}
