package com.ps8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook2 {
	  public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Predefined phone book details
	        Map<String, String> phoneBook = new HashMap<>();
	        phoneBook.put("Amal", "998787823");
	        phoneBook.put("Manvitha", "937843978");
	        phoneBook.put("Joseph", "7882221113");
	        phoneBook.put("Smith", "8293893311");
	        phoneBook.put("Kathe", "7234560011");
	        
	        // Read the name to search
	        System.out.print("Enter the name to search: ");
	        String name = scanner.nextLine();
	        
	        // Search for the phone number
	        String phoneNumber = phoneBook.get(name);
	        
	        // Print the result
	        if (phoneNumber != null) {
	            System.out.println("Output:");
	            System.out.println(phoneNumber);
	        } else {
	            System.out.println("Name not found in the phone book.");
	        }
	        
	        // Close the scanner
	        scanner.close();
	    }
}
