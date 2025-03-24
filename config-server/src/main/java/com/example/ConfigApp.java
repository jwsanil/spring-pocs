package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class);
    }
}
