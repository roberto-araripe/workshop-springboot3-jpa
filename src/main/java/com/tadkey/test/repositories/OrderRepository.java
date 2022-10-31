package com.tadkey.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadkey.test.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
