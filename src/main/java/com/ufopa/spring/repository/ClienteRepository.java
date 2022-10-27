package com.ufopa.spring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufopa.spring.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

}