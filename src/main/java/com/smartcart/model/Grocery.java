package com.smartcart.model;

public class Grocery extends Product {

    private String expiryDate;

    public Grocery(String name, double price,
                   int stockQuantity, String expiryDate) {
        super(name, price, stockQuantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return super.toString() + " | Expiry: " + expiryDate;
    }
}