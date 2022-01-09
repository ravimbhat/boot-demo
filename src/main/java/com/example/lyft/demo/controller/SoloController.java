package com.example.lyft.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }
}
