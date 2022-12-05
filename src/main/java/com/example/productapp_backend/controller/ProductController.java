package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @GetMapping("/")
    public String Homepage()
    {
        return ("Welcome to product app homepage");
    }

    @PostMapping("/add")
    public String productadd()
    {
        return ("Welcome to product add page");
    }

    @PostMapping("/search")
    public String productsearch()
    {
        return ("Welcome to product search page");
    }

    @PostMapping("/edit")
    public String productedit()
    {
        return ("Welcome to product edit page");
    }

    @GetMapping("/view")
    public String productview()
    {
        return ("Welcome to product view page");
    }

    @PostMapping("/delete")
    public String productdelete()
    {
        return ("Welcome to product delete page");
    }
}
