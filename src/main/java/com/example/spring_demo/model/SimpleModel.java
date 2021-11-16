package com.example.spring_demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "simpletable")
public class SimpleModel {
    @Id
    @Column
    private String name;
}
