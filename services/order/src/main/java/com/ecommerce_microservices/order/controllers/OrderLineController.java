package com.ecommerce_microservices.order.controllers;

import com.ecommerce_microservices.order.dtos.OrderLineResponse;
import com.ecommerce_microservices.order.services.OrderLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order-lines")
@RequiredArgsConstructor
public class OrderLineController {
    private final OrderLineService orderLineService;

    @GetMapping("/order/{orderId}")
    public ResponseEntity<List<OrderLineResponse>> findByOrderId(
            @PathVariable("orderId") Integer orderId
    ) {
        return ResponseEntity.ok(orderLineService.findAllByOrderId(orderId));
    }
}
