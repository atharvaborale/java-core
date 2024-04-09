package com.ps5;

import java.util.Scanner;

public class SubSequence {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the String :");
	String s=sc.nextLine();
	System.out.println(" SubSequence of the String" + s + "is :");
	printSubsequence(s);
	
}

private static void printSubsequence(String s) {
	generatesequence(s, "", 0);
	
}

private static void generatesequence(String s, String a, int index) {
	if(index==s.length()) {
		System.out.println(a );
		return;
	}    
	
	generatesequence(s, a + s.charAt(index), index+1);
	
	generatesequence(s, a, index+1);
	
}
}
