package com.ps10;

import java.util.Scanner;

public class QuickSort1 {
	

	    public static void sort(int[] arr, int low, int high) {
	        if (low < high) {
	            // pi is partitioning index, arr[pi] is placed at the right position
	            int pi = partition(arr, low, high);

	            // Recursively sort elements before and after partition
	            sort(arr, low, pi - 1);
	            sort(arr, pi + 1, high);
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];  // pivot element can be chosen at random or other strategies
	        int i = (low - 1); // index of smaller element

	        for (int j = low; j <= high - 1; j++) {
	            // If current element is smaller than the pivot
	            if (arr[j] < pivot) {
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }

	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
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

	        sort(arr, 0, n - 1);

	        System.out.println("Sorted array: ");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        scanner.close();
	    }
	}


