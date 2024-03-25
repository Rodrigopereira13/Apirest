package com.rodrigop13.repository;

import com.rodrigop13.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigop13.entity.Usuarios;

public interface UserRepository extends JpaRepository<Usuarios, Long>{
}
