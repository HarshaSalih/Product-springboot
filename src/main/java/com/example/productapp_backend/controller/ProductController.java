package com.example.productapp_backend.controller;

import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class ProductController {

    @Autowired
    private ProductDao dao;

//    @GetMapping("/")
//    public String Homepage()
//    {
//        return ("Welcome to product app homepage");
//    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> productadd(@RequestBody Product p)
    {
        System.out.println(p.getProductName().toString());
        System.out.println(p.getMan_date().toString());
        System.out.println(p.getExp_date().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getSellerName().toString());
        System.out.println(p.getDistributorName().toString());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }





    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> view()
    {
        return (List<Product>) dao.findAll();
    }


}
