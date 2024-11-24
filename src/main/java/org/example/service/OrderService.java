package org.example.service;

import org.example.dto.OrderDto;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    ResponseEntity<String> saveOrder(OrderDto orderDto);

}
