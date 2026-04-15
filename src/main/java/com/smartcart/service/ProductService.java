package com.smartcart.service;

import com.smartcart.model.Electronics;
import com.smartcart.model.Grocery;
import com.smartcart.model.Product;
import com.smartcart.model.ProductRequest;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {

   private  List<Product> products = new ArrayList<>();

   public ProductService(){
       products.add(new Electronics("Samsung TV", 10000,500,12));
       products.add(new Grocery("Amul Milk",60,200,"2025-12-01"));

   }

   public List<Product> getAllProducts(){
       return products;
   }



    public void addProduct(ProductRequest request) {
        Electronics product = new Electronics(
                request.getName(),
                request.getPrice(),
                request.getStockQuantity(),
                request.getWarrantyMonths()
        );
        products.add(product);
    }
}
