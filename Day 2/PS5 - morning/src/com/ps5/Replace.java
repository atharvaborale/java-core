package com.ps5;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the string: ");
	        String s = scanner.nextLine();
        System.out.println(replaceSpaces(s)); 
    }

    public static String replaceSpaces(String s) {
        return s.replace(" ", "%20");
    }
}
