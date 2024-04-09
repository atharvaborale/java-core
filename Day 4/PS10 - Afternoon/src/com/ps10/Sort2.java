package com.ps10;
import java.util.Scanner;
public class Sort2 {
	

	    public static void sort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Find the middle point
	            int mid = low + (high - low) / 2;

	            // Sort first and second halves
	            sort(arr, low, mid);
	            sort(arr, mid + 1, high);

	            // Merge the sorted halves
	            merge(arr, low, mid, high);
	        }
	    }

	    private static void merge(int[] arr, int low, int mid, int high) {
	        // Create temporary arrays
	        int n1 = mid - low + 1;
	        int n2 = high - mid;
	        int[] left = new int[n1];
	        int[] right = new int[n2];

	        // Copy data to temporary arrays
	        System.arraycopy(arr, low, left, 0, n1);
	        System.arraycopy(arr, mid + 1, right, 0, n2);

	        // Merge the temporary arrays
	        int i = 0, j = 0, k = low;
	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy the remaining elements
	        while (i < n1) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
	    }

	    public static int search(int[] arr, int low, int high, int key) {
	        if (low > high) {
	            return -1; // Element not found
	        }

	        int mid = low + (high - low) / 2;
	        if (arr[mid] == key) {
	            return mid; // Element found at mid
	        } else if (arr[mid] < key) {
	            return search(arr, mid + 1, high, key); // Search in right half
	        } else {
	            return search(arr, low, mid - 1, key); // Search in left half
	        }
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

	        System.out.println("Sorted array:");
	        sort(arr, 0, n - 1);
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }

	        System.out.println("\n\nEnter the element to search: ");
	        int key = scanner.nextInt();

	        int index = search(arr, 0, n - 1, key);
	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found.");
	        }
	        scanner.close();
	    }
	}

