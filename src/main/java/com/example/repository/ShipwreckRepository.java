package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
