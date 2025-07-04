package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class for the REST API module.
 * Scans for components in both rest-api-module and json-schema-module.
 */
//(scanBasePackages = {"com.example.restapi", "com.example.model"})
@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }
}