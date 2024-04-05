package com.ps7;

import java.util.Objects;
import java.util.TreeSet;

public class Person7 implements Comparable<Person7>{

    private int id;
    private String name;
    private int age;
    private double salary;

    public Person7(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person7 person = (Person7) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Person7 other) {
        return Integer.compare(this.id, other.id);
    }


    public static void main(String[] args) {
        TreeSet<Person7> people = new TreeSet<>();

        // Predefined person details
        people.add(new Person7(1, "Jerry", 30, 999.0));
        people.add(new Person7(2, "Smith", 40, 2999.0));
        people.add(new Person7(3, "Popeye", 50, 5999.0));
        people.add(new Person7(4, "Jones", 60, 6999.0));
        people.add(new Person7(5, "John", 32, 1999.0));
        people.add(new Person7(6, "Tom", 42, 3999.0));

        // Print all names in uppercase
        for (Person7 person : people) {
            System.out.println(person.name.toUpperCase());
        }
    }
}
