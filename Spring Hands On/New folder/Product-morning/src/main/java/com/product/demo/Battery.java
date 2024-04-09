package com.product.demo;

public class Battery extends product{
    private boolean rechargeable;

	public boolean getRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	

	@Override
	public String toString() {
		return "Battery [rechargeable=" + rechargeable + ", getRechargeable()=" + getRechargeable()
				+ ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName() + ", getPrice()="
				+ getPrice() + "]";
	}


	
}
