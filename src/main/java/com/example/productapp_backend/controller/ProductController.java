package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @GetMapping("/")
    public String Homepage()
    {
        return ("Welcome to product app homepage");
    }
}
