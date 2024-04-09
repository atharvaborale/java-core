package com.ps8;

import java.util.Hashtable;
import java.util.Objects;

public class Employee9 {
	private int id;
    private String name;
    private String department;
    private String designation;

    public Employee9(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee9 employee = (Employee9) obj;
        return id == employee.id;
    }

    public static void main(String[] args) {
        // Create HashTable to store Employee details with id as key
        Hashtable<Integer, Employee9> employeeTable = new Hashtable<>();

        // Add Employee details
        employeeTable.put(101, new Employee9(101, "John", "HR", "Manager"));
        employeeTable.put(102, new Employee9(102, "Alice", "Finance", "Analyst"));
        employeeTable.put(103, new Employee9(103, "Bob", "IT", "Developer"));
        employeeTable.put(104, new Employee9(104, "Eva", "Marketing", "Coordinator"));

        // Verify whether the HashTable is empty or not
        boolean isEmpty = employeeTable.isEmpty();

        // Output
        System.out.println(isEmpty);
    }
}
