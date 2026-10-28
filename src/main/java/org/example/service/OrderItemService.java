package org.example.service;

import org.example.model.OrderItem;
import org.example.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;
    public OrderItemService(OrderItemRepository orderItemRepository){
        this.orderItemRepository = orderItemRepository;
    }
    public List<OrderItem> getAllOrderItems(){
        return orderItemRepository.findAll();
    }
    public Optional<OrderItem> getOrderItemById(Long id){
        return orderItemRepository.findById(id);
    }
    public OrderItem createOrderItem(OrderItem orderItem){
        return orderItemRepository.save(orderItem);
    }
}
