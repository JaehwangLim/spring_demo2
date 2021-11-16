package com.example.spring_demo.repository;

import java.util.List;

import com.example.spring_demo.model.DemoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;

public interface DemoRepository extends JpaRepository<DemoTable, Integer>{
    @Query("select b from DemoTable b")
    List<DemoTable> findAll();
}
