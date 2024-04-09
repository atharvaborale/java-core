package com.ps3;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number between 1 to 100 -");
		int percent=sc.nextInt();
		
		
		if(percent<=100 && percent>=60) {
			System.out.println("Grade A");
		}
		else if (percent<=60 && percent>=45) {
			System.out.println("Grade B");
		}
		else if (percent<=45 && percent>=35) {
			System.out.println("Grade C");
		}
		else if(percent<35 && percent >0 ) {
			System.out.println("Fail");
		}
		else  {
			System.out.println("Invalid Input");
		}
		
		
	}
}
