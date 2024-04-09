package com.ps8;


import java.util.Map;
import java.util.TreeMap;

public class Car7 implements Comparable<Car7>{
	
	    String name;
	    double price;

	    public Car7(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return name + " " + price;
	    }

	    @Override
	    public int hashCode() {
	        return name.hashCode();
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Car7 car = (Car7) obj;
	        return name.equals(car.name);
	    }

	    @Override
	    public int compareTo(Car7 other) {
	        return Double.compare(this.price, other.price);
	    }
	
	    public static void main(String[] args) {
	        TreeMap<Car7, String> cars = new TreeMap<>();
	        cars.put(new Car7("Bugatti", 80050.0), "");
	        cars.put(new Car7("Swift", 305000.0), "");
	        cars.put(new Car7("Audi", 600100.0), "");
	        cars.put(new Car7("Benz", 900000.0), "");

	        Map.Entry<Car7, String> greatestEntry = cars.lastEntry();
	        Map.Entry<Car7, String> leastEntry = cars.firstEntry();
	        
	        System.out.println(greatestEntry.getKey());
	        System.out.println(leastEntry.getKey());
	    }
	}


