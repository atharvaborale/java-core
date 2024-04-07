package com.ps8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Car6 implements Comparable<Car6>{
	
	    String name;
	    double price;

	    public Car6(String name, double price) {
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
	        Car6 car = (Car6) obj;
	        return name.equals(car.name);
	    }

	    @Override
	    public int compareTo(Car6 other) {
	        return Double.compare(this.price, other.price);
	    }

	    public static void main(String[] args) {
	        Map<Car6, String> cars = new TreeMap<>(Comparator.reverseOrder());
	        cars.put(new Car6("Bugatti", 80050.0), "");
	        cars.put(new Car6("Swift", 305000.0), "");
	        cars.put(new Car6("Audi", 600100.0), "");
	        cars.put(new Car6("Benz", 900000.0), "");

	        for (Car6 car : cars.keySet()) {
	            System.out.println(car);
	        }
	    }
	}


