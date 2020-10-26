package com.atef.mongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }

    @Bean
    CommandLineRunner start(){
        return args -> {
            System.out.println("Atef");
        };
    }

}
