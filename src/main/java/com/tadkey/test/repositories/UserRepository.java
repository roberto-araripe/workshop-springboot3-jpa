package com.tadkey.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadkey.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
