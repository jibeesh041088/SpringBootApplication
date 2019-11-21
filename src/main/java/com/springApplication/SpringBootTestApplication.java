package com.springApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootTestApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootTestApplication.class, args);
    }
}
