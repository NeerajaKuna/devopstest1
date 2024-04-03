package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devopsController {
    @GetMapping("/devtest")
    public void getresult() {
        System.out.println("Getting devops api from devopstest");
    }
}
