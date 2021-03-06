package com.example.ribbon2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Ribbon2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ribbon2Application.class, args);
    }

}

