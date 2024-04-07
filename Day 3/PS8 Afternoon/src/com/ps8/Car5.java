package com.ps8;

import java.util.TreeMap;

public class Car5 implements Comparable<Car5> {
	
	    String name;
	    double price;

	    public Car5(String name, double price) {
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
	        Car5 car = (Car5) obj;
	        return name.equals(car.name);
	    }

	    @Override
	    public int compareTo(Car5 other) {
	        return this.name.compareTo(other.name);
	    }
	
	    public static void main(String[] args) {
	        TreeMap<Car5, String> cars = new TreeMap<>();
	        cars.put(new Car5("Bugatti", 80050.0), "");
	        cars.put(new Car5("Swift", 305000.0), "");
	        cars.put(new Car5("Audi", 600100.0), "");
	        cars.put(new Car5("Benz", 900000.0), "");

	        for (Car5 car : cars.keySet()) {
	            System.out.println(car);
	        }
	    }
	}


