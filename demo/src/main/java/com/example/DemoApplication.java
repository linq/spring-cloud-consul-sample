package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
    }
}
