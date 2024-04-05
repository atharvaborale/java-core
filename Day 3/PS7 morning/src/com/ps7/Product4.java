package com.ps7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Product4 {
	private String productId;
    private String productName;

    public Product4(String productId, String productName) {
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
        Set<Product4> products = new HashSet<>();

        // Add predefined product details
        products.add(new Product4("P001", "Maruti 800"));
        products.add(new Product4("P002", "Maruti Zen"));
        products.add(new Product4("P003", "Maruti Dezire"));
        products.add(new Product4("P004", "Maruti Alto"));

        // Remove a product by ID
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID:");
        String removeProductId = sc.nextLine();
        Iterator<Product4> it = products.iterator();
        boolean removed = false;

        while (it.hasNext()) {
            Product4 product = it.next();
            if (product.getProductId().equals(removeProductId)) {
                it.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product with ID " + removeProductId + " not found.");
        }

        // Print remaining products
        System.out.println("Remaining products:");
        for (Product4 product : products) {
            System.out.println(product);
        }
    }

}
