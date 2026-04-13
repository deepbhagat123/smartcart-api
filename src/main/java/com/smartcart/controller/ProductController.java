package com.smartcart.controller;


import com.smartcart.model.Electronics;
import com.smartcart.model.Grocery;
import com.smartcart.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {

        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Samsung TV", 10000,500,12));
        products.add(new Grocery("Amul Milk",60,200,"2025-12-01"));
        return products;
    }
}