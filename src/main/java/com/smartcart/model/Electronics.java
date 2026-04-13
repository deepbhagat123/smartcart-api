package com.smartcart.model;

public class Electronics extends Product {

    private int WarrantyMonths;

    public Electronics(String name,double price,int StockQuantity,int WarrantyMonths){

        super(name,price,StockQuantity);

        this.WarrantyMonths = WarrantyMonths;
    }

    public int getWarrantyMonths(){ return WarrantyMonths;}


    @Override
    public String toString(){
        return super.toString() + " | Warranty :" + WarrantyMonths + " | Months";
    }


}