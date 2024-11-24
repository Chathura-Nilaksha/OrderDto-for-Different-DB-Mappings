package org.example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.OrderDto;
import org.example.entity.OrderEntityEmbd;
import org.example.repositories.OrderEntityEmbdRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
    //@AllArgsConstructor //Think no need.
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    final OrderEntityEmbdRepository orderEntityEmbdRepository;
    final ModelMapper modelMapper;
    @Override
    public ResponseEntity<String> saveOrder(OrderDto orderDto) {
        OrderEntityEmbd orderEntityEmbd = modelMapper.map(orderDto, OrderEntityEmbd.class);
        orderEntityEmbdRepository.save(orderEntityEmbd);
        return ResponseEntity.ok("Saving correctly.");
    }
}
