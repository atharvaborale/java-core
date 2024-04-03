package com.ps3;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor *= i;
        }
        System.out.println("Factorial of " + num + " is " + factor);
    }
}
