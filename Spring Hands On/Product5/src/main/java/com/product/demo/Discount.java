package com.product.demo;

	public class Discount {
		 private double specialCustomerDiscount;
		    private double summerDiscount;
		    private double endOfYearDiscount;
 
		    

		    public Discount() {
				super();
				// TODO Auto-generated constructor stub
			}



			public Discount(double specialCustomerDiscount, double summerDiscount, double endOfYearDiscount) {
				super();
				this.specialCustomerDiscount = specialCustomerDiscount;
				this.summerDiscount = summerDiscount;
				this.endOfYearDiscount = endOfYearDiscount;
			}



			public double getSpecialCustomerDiscount() {
				return specialCustomerDiscount;
			}



			public void setSpecialCustomerDiscount(double specialCustomerDiscount) {
				this.specialCustomerDiscount = specialCustomerDiscount;
			}



			public double getSummerDiscount() {
				return summerDiscount;
			}



			public void setSummerDiscount(double summerDiscount) {
				this.summerDiscount = summerDiscount;
			}



			public double getEndOfYearDiscount() {
				return endOfYearDiscount;
			}



			public void setEndOfYearDiscount(double endOfYearDiscount) {
				this.endOfYearDiscount = endOfYearDiscount;
			}



			public double applyDiscount(product product) {
		        double discountedPrice = product.getPrice();

		        // Apply discounts based on the type of product
		        if (product instanceof Battery) {
		            discountedPrice *= (1 - summerDiscount);
		        } else if (product instanceof Disc) {
		            discountedPrice *= (1 - endOfYearDiscount);
		        } else {
		            discountedPrice *= (1 - specialCustomerDiscount);
		        }

		        return discountedPrice;
		    }
	}

