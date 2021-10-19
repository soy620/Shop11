package com.aishang.shop11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.aishang.shop11.dao")
public class Shop11Application {

    public static void main(String[] args) {
        SpringApplication.run(Shop11Application.class, args);
    }

}
