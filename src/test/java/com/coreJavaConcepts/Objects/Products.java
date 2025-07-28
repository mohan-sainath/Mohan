package com.coreJavaConcepts.Objects;

public class Products {

    public static void main(String[] args) {
        ProductTemplate product1 = new ProductTemplate();
        product1.name = "Laptop";
        product1.description = "Gaming Laptop under 60000 with Windows OS";
        product1.price = 59999.00;
        product1.category = "Electronics";

        ProductTemplate product2 = new ProductTemplate();
        product2.name = "Highlander T Shirt";
        product2.description = "Round Neck T shirt of size 'M'";
        product2.price = 499.00;
        product2.category = "Clothing";

        //System.out.println("Product 1 details");
        product1.displayDetails();

        System.out.println();
        //System.out.println("Product 2 details");
        product2.displayDetails();

        double product1Discount = product1.applyDiscount(10);
        System.out.println("Discounted Price for " + product1.name + " is " + product1Discount);

        double product2Discount = product2.applyDiscount(5);
        System.out.println("Discounted Price for " + product2.name + " is " + product2Discount);
    }

}
