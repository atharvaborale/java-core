package com.ps7;

import java.util.HashSet;
import java.util.Scanner;

public class ProductSearch {
	    private String productId;
	    private String productName;

	    public ProductSearch(String productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }
	    

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        ProductSearch product = (ProductSearch) obj;
	        return productId.equals(product.productId) && productName.equals(product.productName);
	    }

	    @Override
	    public int hashCode() {
	        return productId.hashCode() + productName.hashCode();
	    }
	

	
	    public static void main(String[] args) {
	        HashSet<ProductSearch> products = new HashSet<>();
	        products.add(new ProductSearch("P001", "Toyota Corolla"));
	        products.add(new ProductSearch("P002", "Honda Civic"));
	        products.add(new ProductSearch("P003", "Maruti Dezire"));
	        products.add(new ProductSearch("P004", "Hyundai Elantra"));

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter product ID:");
	        String productId = scanner.nextLine();
	        System.out.println("Enter product name:");
	        String productName = scanner.nextLine();

	        ProductSearch search = new ProductSearch(productId, productName);

	        if (products.contains(search)) {
	            System.out.println("Product Found");
	        } else {
	            System.out.println("Product Not Found");
	        }
	    
}
	    }
