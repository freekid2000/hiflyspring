package com.example.hiflyspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HiflyspringApplication {
    @Value("${env.name}")
    String name;

    public static void main(String[] args) {
        SpringApplication.run(HiflyspringApplication.class, args);
    }

    @GetMapping("/")
    public String hiFly() {
        return "Hi Fly with Springboot (env name: " + name + " )!";
    }
}
