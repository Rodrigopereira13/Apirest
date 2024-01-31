package com.rodrigop13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigop13.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
