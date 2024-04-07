package com.ps8;

import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

public class Employee10 {
	private int id;
    private String name;
    private String department;
    private String designation;

    public Employee10(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Override toString method
    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
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
        Employee10 employee = (Employee10) obj;
        return id == employee.id;
    }

    public static void main(String[] args) {
        // Create HashTable to store Employee details with id as key
        Hashtable<Integer, Employee10> employeeTable = new Hashtable<>();

        // Add Employee details
        employeeTable.put(1001, new Employee10(1001, "John", "HR", "Manager"));
        employeeTable.put(1002, new Employee10(1002, "Alice", "Finance", "Analyst"));
        employeeTable.put(1003, new Employee10(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee10(1004, "Eva", "Marketing", "Coordinator"));

        // Search for a specific Employee
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Search for specific Employee : ");
        int searchId = sc.nextInt();
        Employee10 searchedEmployee = employeeTable.get(searchId);

        // Output
        if (searchedEmployee != null) {
            System.out.println(searchedEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
