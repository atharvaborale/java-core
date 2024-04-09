package com.ps7;

import java.util.Objects;
import java.util.TreeSet;

public class Person5 implements Comparable<Person5>{
	    private int id;
	    private String name;
	    private int age;
	    private double salary;

	    public Person5(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Person5 person = (Person5) o;
	        return id == person.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	    @Override
	    public int compareTo(Person5 other) {
	        return Integer.compare(this.id, other.id);
	    }
	



	    public static void main(String[] args) {
	        TreeSet<Person5> people = new TreeSet<>();

	        // Predefined person details
	        people.add(new Person5(1, "Alice", 22, 1500.0));
	        people.add(new Person5(2, "Bob", 30, 2200.0));
	        people.add(new Person5(3, "Charlie", 28, 2000.0));
	        people.add(new Person5(4, "David", 25, 1800.0));
	        people.add(new Person5(5, "John", 32, 1999.0));
	        people.add(new Person5(6, "Tom", 42, 3999.0));

	        // Print persons with age greater than 25
	        System.out.println("Persons with age greater than 25:");
	        for (Person5 person : people) {
	            if (person.age > 25) {
	                System.out.println(person);
	            }
	        }
	    }
}
