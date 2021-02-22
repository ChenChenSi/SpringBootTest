package com.chen.test3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 淡
 * @version 1.0
 * @description
 * @create 2021-02-23 0:27
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }
}
