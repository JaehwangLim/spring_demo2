package com.example.spring_demo.controller;

import java.util.List;

import com.example.spring_demo.model.DemoTable;
import com.example.spring_demo.model.SimpleModel;
import com.example.spring_demo.repository.DemoRepository;
import com.example.spring_demo.repository.SimpleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class DemoController {
    @Autowired
    private final DemoRepository demoRepository;

    @Autowired
    private final SimpleRepository simpleRepository;
    
    @Value("${spring.application.version}")
    private String version;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/version")
    public String version(){
        log.info("/version called");
        return version;
    }

    @GetMapping("/home")
    public String home(){
        log.info("/home called");
        return "Welcome " + applicationName + " !!!";
    }

    @GetMapping("/count")
    public int totalCount() throws Exception {
        log.info("/count called");
        return (int)demoRepository.count();
    }

    @GetMapping("/check")
    public List<DemoTable> list(){
        return demoRepository.findAll();
    }

    @GetMapping("/check2")
    public List<SimpleModel> list2(){
        return simpleRepository.findAll();
        // return true;
    }
}
