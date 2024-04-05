package com.ps3;

import java.util.Scanner;

public class Rightangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
	}
	
}
