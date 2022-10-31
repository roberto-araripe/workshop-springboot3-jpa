package com.tadkey.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadkey.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
