package com.smartcart.service;

import com.smartcart.model.Electronics;
import com.smartcart.model.Grocery;
import com.smartcart.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Samsung TV", 10000, 500, 12));
        products.add(new Grocery("Amul Milk", 60, 200, "2025-12-01"));
        return products;
    }
}
