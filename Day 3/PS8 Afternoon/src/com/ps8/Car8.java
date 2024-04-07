package com.ps8;


import java.util.Objects;
import java.util.TreeMap;

public class Car8 implements Comparable<Car8> {
	


	private String name;
    private double price;

    public Car8(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car8 car = (Car8) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Car8 otherCar) {
        return Double.compare(this.price, otherCar.price);
    }

    public static void main(String[] args) {
        TreeMap<Car8, Double> carPrices = new TreeMap<>();

        carPrices.put(new Car8("Bugatti", 80050.0), 80050.0);
        carPrices.put(new Car8("Swift", 305000.0), 305000.0);
        carPrices.put(new Car8("Audi", 600100.0), 600100.0);
        carPrices.put(new Car8("Reva", 25000.0), 25000.0); // Added Reva for demonstration

        // Get car with highest price (greatest key)
        Car8 mostExpensiveCar = carPrices.lastKey();
        System.out.println("Most Expensive Car:");
        System.out.println(mostExpensiveCar); // Output: Audi 600100.0

        // Remove car with name "Bugatti" (assuming unique names)
        Car8 carToRemove = new Car8("Bugatti", 0.0); // Price doesn't matter for removal based on name
        carPrices.remove(carToRemove);

        System.out.println("\nCar Details After Removal:");
        carPrices.forEach((car, price) -> System.out.println(car));
        // Output:
        // Reva 25000.0
        // Swift 305000.0
        // Audi 600100.0
    }

}
