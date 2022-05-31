package com.kkb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    public String hello() {
        int i=1,b=2;
        return "Hello World Spring Boot!"+dataSource;
    }
}
