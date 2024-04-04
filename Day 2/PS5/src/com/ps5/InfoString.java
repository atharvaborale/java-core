package com.ps5;

import java.util.Scanner;

public class InfoString {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	      
	        System.out.println("Length of the string: " + input.length());

	      
	        String uppercaseString = input.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);

	       
	        if (isPalindrome(input)) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome.");
	        }
	    }

	    // Method to check  is a palindrome
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
}
