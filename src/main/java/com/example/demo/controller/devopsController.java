package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devopsController {
    @GetMapping("/devtest")
    public String getresult() {
        System.out.println("Getting devops api from devopstest");
        return "Getting devops api from devopstest";
    }
}
