package com.example.controllers;

import com.example.models.OrderChangeNotification;
import com.example.models.Summary;
import com.example.services.IAmazonOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Osada
 * @created 05/01/2025
 */
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class AmazonOrderController {
    private final IAmazonOrderService amazonOrderService;

    @GetMapping("/notifications")
    public ResponseEntity<List<OrderChangeNotification>> loadOrderChangeNotifications() {
        List<OrderChangeNotification> notifications = amazonOrderService.loadOrderChangeNotifications();
        return ResponseEntity.ok().body(notifications);
    }

    @GetMapping("/summary")
    public ResponseEntity<Map<Summary.OrderStatus, Long>> fetchOrderSummary() {
        Map<Summary.OrderStatus, Long> orderSummary = amazonOrderService
                .loadEventSummary();
        return ResponseEntity.ok().body(orderSummary);
    }

    @GetMapping("/change-events")
    public ResponseEntity<List<OrderChangeNotification>> loadOrderChangeEvents() {
        List<OrderChangeNotification> notifications = amazonOrderService.loadOrderChangeEvents();
        return ResponseEntity.ok().body(notifications);
    }
}
