package com.ps10;
import java.util.Scanner;
public class LinearSearch3 {
	

	    public static int search(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i; // Element found at index i
	            }
	        }
	        return -1; // Element not found
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int key = scanner.nextInt();

	        int index = search(arr, key);
	        if (index != -1) {
	            System.out.println("Element is Present");
	        } else {
	            System.out.println("Element is not Present.");
	        }
	        scanner.close();
	    }
	}

