package com.springApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringHelloApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringHelloApplication.class, args);
    }
}
