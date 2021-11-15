package com.example.spring_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class DemoController {
    private static final String version = "1.0.0";

    @GetMapping("/version")
    public String version(){
        log.info("/version called");
        return version;
    }

    @GetMapping("/home")
    public String home(){
        log.info("/home called");
        return "Welcome Spring Boot Demo Application!";
    }
}
