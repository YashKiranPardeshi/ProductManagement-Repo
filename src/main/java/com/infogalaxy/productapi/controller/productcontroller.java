package com.infogalaxy.productapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod/api")
public class productcontroller {
    @GetMapping("/home")
    public String homepage(){
        return "welcome to Prod API";
    }
@PostMapping("/addprod")
    public String addprod(){
        return "prod Added";
    }
}
