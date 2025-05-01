package com.example.services;

import com.example.models.OrderChangeNotification;
import com.example.models.Summary;

import java.util.List;
import java.util.Map;

/**
 * @author Osada
 * @created 05/01/2025
 */
public interface IAmazonOrderService {
    public Map<Summary.OrderStatus, Long> loadEventSummary();
    public List<OrderChangeNotification> loadOrderChangeNotifications();
    public List<OrderChangeNotification> loadOrderChangeEvents();
}
