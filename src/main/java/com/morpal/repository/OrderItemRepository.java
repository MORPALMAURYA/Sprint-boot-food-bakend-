package com.morpal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morpal.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
