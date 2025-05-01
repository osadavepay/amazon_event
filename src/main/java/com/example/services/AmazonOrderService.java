package com.example.services;

import com.example.entity.AmazonOrderStatusEvent;
import com.example.entity.AmazonOrderStatusEventTmp;
import com.example.models.OrderChangeNotification;
import com.example.models.OrderChangeNotification__1;
import com.example.models.Payload;
import com.example.models.Summary;
import com.example.repositories.AmazonOrderStatusRepository;
import com.example.repositories.AmazonOrderStatusTmpRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Osada
 * @created 05/01/2025
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class AmazonOrderService implements IAmazonOrderService{

    private final AmazonOrderStatusTmpRepository amazonOrderStatusTmpRepository;
    private final AmazonOrderStatusRepository amazonOrderStatusRepository;
    private final ObjectMapper objectMapper;
    @Override
    public Map<Summary.OrderStatus, Long> loadEventSummary() {

        List<AmazonOrderStatusEventTmp> events = amazonOrderStatusTmpRepository.findAll();

        Map<Summary.OrderStatus, Long> orderSummary = events
                .stream()
                .map(event -> {

            String content = event.getContent();
            try {
                OrderChangeNotification ocn = objectMapper
                        .readValue(content, OrderChangeNotification.class);
                Payload payload = ocn.getPayload();
                OrderChangeNotification__1 ocn_1 = payload.getOrderChangeNotification();
                Summary summary = ocn_1.getSummary();
                return summary;

            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        }).collect(Collectors.groupingBy(Summary::getOrderStatus,Collectors.counting()));

        log.info("Order Summary : {}", orderSummary);

        return orderSummary;
    }

    @Override
    public List<OrderChangeNotification> loadOrderChangeNotifications() {
        List<AmazonOrderStatusEventTmp> events = amazonOrderStatusTmpRepository.findAll();
        List<OrderChangeNotification>  changeNotifications = events
                .stream().map(event -> {
                    String content = event.getContent();
                    try {
                        OrderChangeNotification ocn = objectMapper
                                .readValue(content, OrderChangeNotification.class);
                        return ocn;
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList());
        return changeNotifications;
    }

    @Override
    public List<OrderChangeNotification> loadOrderChangeEvents() {
        List<AmazonOrderStatusEvent> events = amazonOrderStatusRepository.findAll();
        List<OrderChangeNotification>  changeNotifications = events
                .stream().map(event -> {
                    String content = event.getContent();
                    try {
                        OrderChangeNotification ocn = objectMapper
                                .readValue(content, OrderChangeNotification.class);
                        return ocn;
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList());
        return changeNotifications;
    }
}
