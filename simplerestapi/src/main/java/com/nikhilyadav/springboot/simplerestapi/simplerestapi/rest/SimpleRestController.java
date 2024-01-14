package com.nikhilyadav.springboot.simplerestapi.simplerestapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
