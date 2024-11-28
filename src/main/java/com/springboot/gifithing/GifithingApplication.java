package com.springboot.gifithing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GifithingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GifithingApplication.class, args);
    }

}
