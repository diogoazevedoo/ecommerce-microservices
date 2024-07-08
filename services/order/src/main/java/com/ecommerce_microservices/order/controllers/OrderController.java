package com.ecommerce_microservices.order.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce_microservices.order.dtos.OrderRequest;
import com.ecommerce_microservices.order.dtos.OrderResponse;
import com.ecommerce_microservices.order.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Integer> createOrder(
            @RequestBody @Valid OrderRequest request
    ) {
        return ResponseEntity.ok(orderService.createOrder(request));
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> findAll() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderResponse> findById(
            @PathVariable("orderId") Integer orderId
    ) {
        return ResponseEntity.ok(orderService.findById(orderId));
    }
}
