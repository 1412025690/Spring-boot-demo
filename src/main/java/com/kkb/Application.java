package com.kkb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.kkb.dao") //扫描dao所有接口 产生接口代理对象
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
