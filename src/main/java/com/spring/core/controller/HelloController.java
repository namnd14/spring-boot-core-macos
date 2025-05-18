package com.spring.core.controller;

import com.spring.core.utils.Java8;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        Java8 java8 = new Java8();
        java8.log();
        return "Hello World";
    }
}
