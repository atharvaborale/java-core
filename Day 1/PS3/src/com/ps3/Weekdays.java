package com.ps3;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number between 1 to 7 -");
		int daynum=sc.nextInt();
		
		if(daynum==1) {
			System.out.println("Sunday");	
		} else if (daynum==2) {
			System.out.println("Monday");
		}else if (daynum==3) {
			System.out.println("Tuesday");
		}else if (daynum==4) {
			System.out.println("Wednesday");	
		}else if (daynum==5) {
			System.out.println("Thursday");
		
		}else if (daynum==6) {
			System.out.println("Friday");
		}else if (daynum==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}

