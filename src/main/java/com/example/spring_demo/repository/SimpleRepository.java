package com.example.spring_demo.repository;

import com.example.spring_demo.model.SimpleModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<SimpleModel, Long>{
    
}
