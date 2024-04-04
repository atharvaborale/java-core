package com.ps5;

import java.util.Scanner;

public class StringSplitter {
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the string: ");
	        String s = scanner.nextLine();
		        System.out.println(checkString(s));  
		        
		        String b = scanner.nextLine();
		        System.out.println(checkString(b));  
		    }

		    public static String checkString(String s) {
		        int[] count = new int[256];  // ASCII values range from 0 to 255

		        for (char c : s.toCharArray()) {
		            count[(int) c]++;
		        }

		        int distinctChars = 0;
		        for (int i = 0; i < 256; i++) {
		            if (count[i] > 0) {
		                distinctChars++;
		            }
		        }

		        if (distinctChars < 4) {
		            return "No";
		        } else {
		            return "Yes";
		        }
		    }
}
