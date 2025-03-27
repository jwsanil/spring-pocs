package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class GrpahQlApp {

    @Autowired
    BooKRepository booKRepository;
    public static void main(String[] args) {
        System.out.println("Hello World!");



        SpringApplication.run(GrpahQlApp.class);
    }
}
