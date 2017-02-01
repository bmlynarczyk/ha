package com.introsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DispatcherApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "dispatcher");
        SpringApplication.run(DispatcherApplication.class, args);
    }

}
