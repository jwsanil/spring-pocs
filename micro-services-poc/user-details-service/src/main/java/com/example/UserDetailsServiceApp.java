package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

@EnableDiscoveryClient
public class UserDetailsServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(UserDetailsServiceApp.class);
    }
}
