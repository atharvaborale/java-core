package com.product.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) throws IOException {
		
		        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		        
		        Battery product1 = (Battery) context.getBean("Battery");
		        Disc product2 = (Disc) context.getBean("Disc");
		        
		        ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");
		        // add some products to the cart
		        cart.addItem(product1);
		        cart.addItem(product2);

		        // Customer 2
//		        ShoppingCart cart2 = context.getBean("shoppingCart", ShoppingCart.class);
//		        cart2.addItem(new product("3","Product 3", 240.0));

		        // Display items in each cart
		        System.out.println("Items in Cart 1:");
		        for (product item : cart.getItems()) {
		            System.out.println(item.getProductName() + " - Ruppees " + item.getPrice());
		        }

//		        System.out.println("Items in Cart 2:");
//		        for (product item : cart2.getItems()) {
//		            System.out.println(item.getProductName() + " - Rupees " + item.getPrice());
//		        }
		        Cashier cashier = (Cashier) context.getBean("cashier");
		        cashier.checkout(cart);
		              
		        
		        

		     
		    }
		        // Retrieve discount bean
//		        Discount discount = context.getBean("discount", Discount.class);
		       
//		        Battery battery = (Battery) context.getBean("Battery");
//		        System.out.println("Battery Details: " + battery);
//		        Disc disc = (Disc) context.getBean("Disc");
//		        System.out.println("Disc Details: " + disc);
		        // Create products
//		        product product1 = (product) context.getBean("product");
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

		
		
	


