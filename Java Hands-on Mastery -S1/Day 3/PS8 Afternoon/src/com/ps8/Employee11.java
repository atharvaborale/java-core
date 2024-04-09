package com.ps8;

import java.util.HashMap;
import java.util.Scanner;

public class Employee11 {
	 	private int id;
	    private String name;
	    private String department;
	    private String title;

	    public Employee11(int id, String name, String department, String title) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.title = title;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + department + " " + title;
	    }

	    public static void main(String[] args) {
	        HashMap<Integer, Employee11> employees = new HashMap<>();

	        // Predefined employee data (modify as needed)
	        employees.put(1001, new Employee11(1001, "Daniel", "Analyst", "Testing"));
	        employees.put(1002, new Employee11(1002, "Thomas", "Tester", ""));
	        employees.put(1003, new Employee11(1003, "Robert", "Product Manager", "Development"));
	        employees.put(1004, new Employee11(1004, "Grace", "Tech Support", "HR"));

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter employee details ID Name Department Title :");
	      
	            String input = scanner.nextLine();
	           
	            String[] parts = input.split(" ");
	            
	            if (parts.length != 4) {
	                System.out.println("Invalid input format. Please enter details in the format (ID Name Department Title).");
	                
	            }

	            int id = Integer.parseInt(parts[0]);
	            String name = parts[1];
	            String department = parts[2];
	            String title = parts[3];

	            // Add employee if not already present
	            if (!employees.containsKey(id)) {
	                employees.put(id, new Employee11(id, name, department, title));
	                System.out.println(id + " added successfully.");
	            } else {
	                System.out.println("Employee with ID " + id + " already exists.");
	            }
	        

	        System.out.println("\nExisting Employee Details:");
	        for (Employee11 employee : employees.values()) {
	            System.out.println(employee);
	        }
	    }
}

