package com.example.spring_demo.model;

import lombok.Data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
@Table(name = "simpletable2")
public class DemoTable {
    @Id
    @Column
    private long id;
    
    @Column
    private String title;
}
