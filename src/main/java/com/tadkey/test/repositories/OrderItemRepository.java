package com.tadkey.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadkey.test.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
