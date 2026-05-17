package com.example.springboot_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/contact")
    public String getContactData(){
        return "8888888888";
    }
}
