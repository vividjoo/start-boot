package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method= RequestMethod.GET, path="/demo")
public class DemoController {

    @GetMapping("/controller")
    public String demo() {
        System.out.println("demo");
        return "controller";
    }
}
