package com.microservices.usermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.usermanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
