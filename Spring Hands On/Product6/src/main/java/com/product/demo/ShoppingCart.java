package com.product.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	private List<product> items = new ArrayList<>();

    public void addItem(product item) {
        items.add(item);
    }

    public List<product> getItems() {
        return items;
    }
    public void removeItemById(String productId) {
        // Iterate through the list of items
        for (Iterator<product> iterator = items.iterator(); iterator.hasNext();) {
            product product = iterator.next();
            // Check if the product's ID matches the specified ID
            if (product.getProductId().equals(productId)) {
                iterator.remove(); // Remove the product
                return; // Exit the method after removing the first occurrence
            }
        }
        // If the product with the specified ID is not found
        System.out.println("Product with ID " + productId + " not found in the cart.");
    }
    public void updateItemById(String productId, product updatedProduct) {
        // Iterate through the list of items
        for (int i = 0; i < items.size(); i++) {
            product product = items.get(i);
            // Check if the product's ID matches the specified ID
            if (product.getProductId().equals(productId)) {
                items.set(i, updatedProduct); // Update the product
                return; // Exit the method after updating the first occurrence
            }
        }
        // If the product with the specified ID is not found
        System.out.println("Product with ID " + productId + " not found in the cart.");
    }

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + ", getItems()=" + getItems() + ", toString()=" + super.toString() + "]";
	}


	
}
