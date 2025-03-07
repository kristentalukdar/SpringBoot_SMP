package com.second.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello from Kristen!";
    }

    @GetMapping("/srm")
    public String indexSRM() {
        return "Hello from SRM!";
    }
}
