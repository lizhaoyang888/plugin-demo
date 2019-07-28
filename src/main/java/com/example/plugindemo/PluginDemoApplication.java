package com.example.plugindemo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class PluginDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PluginDemoApplication.class, args);
    }

    @GetMapping(value = "")
    public String hello(){
        log.info("hello {}","lichaoyang");
        return "hello";
    }
}
