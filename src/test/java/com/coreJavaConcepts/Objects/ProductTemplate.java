package com.coreJavaConcepts.Objects;

public class ProductTemplate {

    String name, description, category;
    double price;

    public void displayDetails(){
        System.out.println("Name of the Product : " + name);
        System.out.println("Description : " + description);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
    }

    public double applyDiscount(double discountPercentage){
        return price * (1 - discountPercentage/100);
    }

}
