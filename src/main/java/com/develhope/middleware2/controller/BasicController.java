package com.develhope.middleware2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @GetMapping()
    public String welcomeMessage(){
        return "Welcome to BasicController";
    }
}
