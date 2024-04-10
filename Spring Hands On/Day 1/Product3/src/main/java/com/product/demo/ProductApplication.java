package com.product.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		
		        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		        // Retrieve discount bean
		        Discount discount = context.getBean("discount", Discount.class);
		       
//		        Battery battery = (Battery) context.getBean("Battery");
//		        System.out.println("Battery Details: " + battery);
//		        Disc disc = (Disc) context.getBean("Disc");
//		        System.out.println("Disc Details: " + disc);
		        // Create products
		        product product1 = (product) context.getBean("product");
		        Battery battery = (Battery) context.getBean("Battery");
		        Disc disc = (Disc) context.getBean("Disc");

		        // Apply discount to products
		        double discountedPrice1 = product1.applyDiscount(discount);
		        double discountedPrice2 = battery.applyDiscount(discount);
		        double discountedPrice3 = disc.applyDiscount(discount);

		        // Print discounted prices
		        System.out.println("Discounted Price of Product1: " + discountedPrice1);
		        System.out.println("Discounted Price of Battery1: " + discountedPrice2);
		        System.out.println("Discounted Price of Disc1: " + discountedPrice3);
		    }
		}

		
	


