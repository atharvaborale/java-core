package com.product.demo;

import org.springframework.stereotype.Component;

@Component
public class product {
	  	private String productId;
	    private String productName;
	    private double price; 

	    
	    
		public product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
		}
		public product(String productId, String productName, double price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}
		
	
		
	
		
}