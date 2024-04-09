package com.ps7;

import java.util.HashSet;

public class Product {
	private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
   
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        // Adding predefined product details
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // List all the product details
        System.out.println("Product details:");
        for (Product product : products) {
            System.out.println(product);
        }}
    }
    


