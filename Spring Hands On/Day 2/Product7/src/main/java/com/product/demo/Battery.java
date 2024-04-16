package com.product.demo;

import org.springframework.stereotype.Component;

@Component
public class Battery extends product{
    private boolean rechargeable;

	public boolean getRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

	
	
	
	public Battery(String productId, String productName, double price, boolean rechargeable) {
		super(productId, productName, price);
		this.rechargeable = rechargeable;
	}

	@Override
	public String toString() {
		return "Battery [rechargeable=" + rechargeable + ", getProductId()=" + getProductId() + ", getProductName()="
				+ getProductName() + ", getPrice()=" + getPrice() + "]";
	}


	


	
}
