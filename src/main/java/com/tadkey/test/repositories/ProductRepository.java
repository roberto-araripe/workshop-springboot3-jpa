package com.tadkey.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadkey.test.entities.Category;
import com.tadkey.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
