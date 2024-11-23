package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.dto.OrderDto;
import org.example.service.OrderService;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    //@CrossOrigin(origins = "http://localhost:5173") //I think no need this
@RequiredArgsConstructor
@RestController
    //@AllArgsConstructor //I think no need this
@RequestMapping(path = "/order")
public class OrderController {
    @Lazy
    final OrderService orderService;
    @PostMapping(path = "/save-the-order")
    public ResponseEntity<String> saveOrder(@RequestBody OrderDto orderDto){
        return orderService.saveOrder(orderDto);
    }
}
