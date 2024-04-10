package com.product.demo;

public class Disc extends product{
	  private int capacity;

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		

		public Disc(String productId, String productName, double price, int capacity) {
			super(productId, productName,price);
			this.capacity = capacity;
			
		}

		@Override
		public String toString() {
			return "Disc [capacity=" + capacity + ", getCapacity()=" + getCapacity() + ", getProductId()="
					+ getProductId() + ", getProductName()=" + getProductName() + ", getPrice()=" + getPrice()
					;
		}

}
