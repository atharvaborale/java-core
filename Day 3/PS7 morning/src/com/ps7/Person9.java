package com.ps7;

import java.util.Objects;
import java.util.TreeSet;

public class Person9 implements Comparable<Person9>{
	 private int id;
	    private String name;
	    private int age;
	    private double salary;

	    public Person9(int id, String name, int age, double salary) {
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
	        Person9 person = (Person9) o;
	        return id == person.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	    @Override
	    public int compareTo(Person9 other) {
	        return Integer.compare(this.id, other.id);
	    }
	

	    public static void main(String[] args) {
	        TreeSet<Person9> people = new TreeSet<>();

	        // Predefined person details
	        people.add(new Person9(1, "Jerry", 30, 999.0));
	        people.add(new Person9(2, "Smith", 40, 2999.0));
	        people.add(new Person9(3, "Popeye", 50, 5999.0));
	        people.add(new Person9(4, "Jones", 60, 6999.0));
	        people.add(new Person9(5, "John", 32, 1999.0));
	        people.add(new Person9(6, "Tom", 42, 3999.0));

	        // Find the first person whose name starts with "J"
	        Person9 firstJPerson = null;
	        for (Person9 person : people) {
	            if (person.name.startsWith("J")) {
	                firstJPerson = person;
	                break;
	            }
	        }

	        // Print the first person (if found)
	        if (firstJPerson != null) {
	            System.out.println(firstJPerson);
	        } else {
	            System.out.println("No person found with name starting with 'J'");
	        }
	    }
}
