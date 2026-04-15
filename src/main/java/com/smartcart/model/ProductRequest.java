package com.smartcart.model;



public class ProductRequest {
    private String name;
    private double price;
    private int stockQuantity;
    private int warrantyMonths;

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    public int getWarrantyMonths() { return warrantyMonths; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    public void setWarrantyMonths(int warrantyMonths) { this.warrantyMonths = warrantyMonths; }




}