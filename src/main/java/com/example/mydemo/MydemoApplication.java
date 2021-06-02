package com.example.mydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@MapperScan("com.example.mydemo.dao")
@SpringBootApplication
public class MydemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MydemoApplication.class, args);
    }

}
