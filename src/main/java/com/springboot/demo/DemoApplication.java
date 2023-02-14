package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController("/")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hi")
    public String hi() {
        System.out.println("hi");
        return "hi";
    }

    @GetMapping("/map")
    public Map<String, Object> map() {
        Map<String, Object> params = new HashMap<>();
        System.out.println("map");
        params.put("hi", "zz");
        return params;
    }
}
