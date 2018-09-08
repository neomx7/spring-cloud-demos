package com.lh.springcloud.demos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Value(value = "${message.url}")

    @RequestMapping("/hello")
    public String hello() {
        return "hello world consul";
    }
}
