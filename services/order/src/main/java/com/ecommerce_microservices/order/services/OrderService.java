package com.ecommerce_microservices.order.services;

import com.ecommerce_microservices.order.dtos.OrderLineRequest;
import com.ecommerce_microservices.order.dtos.OrderRequest;
import com.ecommerce_microservices.order.dtos.PurchaseRequest;
import com.ecommerce_microservices.order.exceptions.BusinessException;
import com.ecommerce_microservices.order.mappers.OrderMapper;
import com.ecommerce_microservices.order.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderLineService orderLineService;

    public Integer createOrder(OrderRequest request) {
        var customer = customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException(
                        "Cannot create order:: No Customer exists with the provided ID")
                );
        productClient.purchaseProducts(request.products());
        var order = this.orderRepository.save(orderMapper.toOrder(request));
        for (PurchaseRequest purchaseRequest: request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )
            );
        }
        //TODO: start payment process
        //TODO: send order confirmation
        return null;
    }
}
