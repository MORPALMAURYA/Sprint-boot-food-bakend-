package com.morpal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morpal.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
