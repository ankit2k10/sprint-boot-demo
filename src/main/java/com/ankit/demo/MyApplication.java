package com.ankit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.ankit.demo.repository", "com.ankit.demo.services"})
//@EnableAutoConfiguration
//@Configuration
public class MyApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        SpringApplication.run(MyApplication.class, args);
    }
}
