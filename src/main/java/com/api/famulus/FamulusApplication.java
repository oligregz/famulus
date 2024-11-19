package com.api.famulus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@ComponentScan(basePackages = "com.api.famulus")
public class FamulusApplication {

  public static void main(String[] args) {
    // Load .env
    Dotenv dotenv = Dotenv.configure().directory("./").filename(".env").load();

    // Config enviroment variables for application
    dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));

    SpringApplication.run(FamulusApplication.class, args);
  }
}
