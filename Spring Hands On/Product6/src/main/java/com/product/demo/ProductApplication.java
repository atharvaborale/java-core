package com.product.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.Beans;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		
		
		        ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml");
		        
		        Battery product1 = (Battery) context.getBean("Battery");
		        Disc product2 = (Disc) context.getBean("Disc");
		        
		        
		        ShoppingCart cart1 = context.getBean("shoppingCart", ShoppingCart.class);
		        
		        cart1.addItem(product1);
		        cart1.addItem(product2);
		        
		        
		        System.out.println("Customer 1 Shopping Cart:");
		        for (product product : cart1.getItems()) {
		            System.out.println(product.getProductName());
		        }
		        
		        cart1.removeItemById("1234");
		        
		        System.out.println("Customer 1 Shopping Cart:");
		        for (product product : cart1.getItems()) {
		            System.out.println(product.getProductName());
		        }
		        
		        
		        product updatedProduct = new product("5678", "Updatedproduct", 150.0);
		        cart1.updateItemById("5678", updatedProduct);
		        
		        
		        System.out.println("Customer 1 Shopping Cart:");
		        for (product product : cart1.getItems()) {
		            System.out.println(product.getProductName());
		        }
//		        cart1.updateItem(("1","Product 1", 546),("4","Product 5", 54we6));
		        // Retrieve discount bean
//		        Discount discount = context.getBean("discount", Discount.class);
		       
//		        Battery battery = (Battery) context.getBean("Battery");
//		        System.out.println("Battery Details: " + battery);
//		        Disc disc = (Disc) context.getBean("Disc");
//		        System.out.println("Disc Details: " + disc);
		        // Create products
		      
//		        Battery battery = (Battery) context.getBean("Battery");
//		        Disc disc = (Disc) context.getBean("Disc");
//
//		        // Apply discount to products
//		        double discountedPrice1 = product1.applyDiscount(discount);
//		        double discountedPrice2 = battery.applyDiscount(discount);
//		        double discountedPrice3 = disc.applyDiscount(discount);
//
//		        // Print discounted prices
//		        System.out.println("Discounted Price of Product1: " + discountedPrice1);
//		        System.out.println("Discounted Price of Battery1: " + discountedPrice2);
//		        System.out.println("Discounted Price of Disc1: " + discountedPrice3);
		        // Customer 1
//		        ShoppingCart cart1 = context.getBean("shoppingCart", ShoppingCart.class);
		 
		        
		        
		    }

		
}	
	


