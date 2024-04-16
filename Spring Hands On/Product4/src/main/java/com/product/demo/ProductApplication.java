package com.product.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		
		        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		        
		        
		        
		        Battery product1 = (Battery) context.getBean("Battery");
		        Disc product2 = (Disc) context.getBean("Disc");
		        
		        
		     // Get instances of ShoppingCart for two customers
		        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
		        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
		        
		        

//		        // Add products to the shopping carts
		        cart1.addItem(product1);
		        cart1.addItem(product2);
		        
		        
		        cart2.addItem(product1);
		       
//
//		        cart2.addItem(new product("Product3"));
//
		        // Display the items in each shopping cart
//		        
//		      System.out.println(cart1.getItems());
//		      System.out.println(cart2.getItems());
		        
		      
		        
		        System.out.println("Customer 1 Shopping Cart:");
		        for (product product : cart1.getItems()) {
		            System.out.println(product.getProductName());
		        }

		        System.out.println("Customer 2 Shopping Cart:");
		        for (product product : cart2.getItems()) {
		            System.out.println(product.getProductName());
		        }
//		    }
		        // Retrieve discount bean
//		        Discount discount = context.getBean("discount", Discount.class);
		       
//		        Battery battery = (Battery) context.getBean("Battery");
//		        System.out.println("Battery Details: " + battery);
//		        Disc disc = (Disc) context.getBean("Disc");
//		        System.out.println("Disc Details: " + disc);
		        
		
		        
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
//		        cart1.addItem(new product("1","Product 1", 546));
//		        cart1.addItem(new product("2","Product 2", 15.0));

//		        // Customer 2
//		        ShoppingCart cart2 = context.getBean("shoppingCart", ShoppingCart.class);
//		        cart2.addItem(new product("3","Product 3", 20.0));
//
//		        // Display items in each cart
//		        System.out.println("Items in Cart 1:");
//		        for (product item : cart1.getItems()) {
//		            System.out.println(item.getProductName() + " - Ruppees " + item.getPrice());
//		        }
//
//		        System.out.println("Items in Cart 2:");
//		        for (product item : cart2.getItems()) {
//		            System.out.println(item.getProductName() + " - Rupees " + item.getPrice());
//		        }
		    }
}
		
		
	


