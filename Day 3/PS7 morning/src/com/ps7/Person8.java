package com.ps7;

import java.util.Objects;
import java.util.TreeSet;

public class Person8 implements Comparable<Person8>{
	 private int id;
	    private String name;
	    private int age;
	    private double salary;
 
	    public Person8(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return id + ", " + name + ", " + age + ", " + salary;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Person8 person = (Person8) o;
	        return id == person.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	    @Override
	    public int compareTo(Person8 other) {
	        return Integer.compare(this.id, other.id);
	    }


	    public static void main(String[] args) {
	        TreeSet<Person8> people = new TreeSet<>();

	        // Predefined person details
	        people.add(new Person8(1, "Jerry", 30, 999.0));
	        people.add(new Person8(2, "Smith", 40, 2999.0));
	        people.add(new Person8(3, "Popeye", 50, 5999.0));
	        people.add(new Person8(4, "Jones", 60, 6999.0));
	        people.add(new Person8(5, "John", 32, 1999.0));
	        people.add(new Person8(6, "Tom", 42, 3999.0));

	        // Calculate and print the sum of all salaries
	        double totalSalary = 0.0;
	        for (Person8 person : people) {
	            totalSalary += person.salary;
	        }
	        System.out.println("Sum of all salaries: " + totalSalary);
	    }
}
