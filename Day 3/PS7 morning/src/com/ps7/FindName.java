package com.ps7;

import java.util.ArrayList;
import java.util.Scanner;

public class FindName {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> studentNames = new ArrayList<>();

	        // Input student names
	        System.out.println("Enter student names separated by spaces:");
	        String[] names = scanner.nextLine().split(" ");
	        for (String name : names) {
	            studentNames.add(name);
	        }

	        // Input name to find
	        System.out.println("Enter the name to find:");
	        String nameToFind = scanner.next();

	        // Check if the name exists
	        if (studentNames.contains(nameToFind)) {
	            System.out.println("Found");
	        } else {
	            System.out.println("Not Found");
	        }

	        scanner.close();
	    }
}
