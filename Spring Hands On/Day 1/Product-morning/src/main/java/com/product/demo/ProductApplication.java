package com.product.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		
		        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		        Battery battery = (Battery) context.getBean("Battery");
		        System.out.println("Battery Details: " + battery);

		        Disc disc = (Disc) context.getBean("Disc");
		        System.out.println("Disc Details: " + disc);
		    }
		}

		
	


