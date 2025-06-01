package com.spring.core.controller;

import com.spring.core.service.RedisServiceExample;
import com.spring.core.utils.Java8;
import com.spring.core.utils.TextBlocks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final RedisServiceExample redisServiceExample;

    public HelloController(RedisServiceExample redisServiceExample) {
        this.redisServiceExample = redisServiceExample;
    }

    @GetMapping("/hello")
    public String sayHello() {
        Java8 java8 = new Java8();
        java8.log();
        TextBlocks textBlocks = new TextBlocks();
        textBlocks.log();
        return "Hello World";
    }

    @GetMapping("/redis")
    public void redis() {
        String bike1 = redisServiceExample.getValue("bike:1").toString();
        System.out.println(bike1);
    }
}
