package com.ps5;

import java.util.Scanner;

public class ChainFormation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        
        boolean canFormCircle = canFormCircle(strings);
        if (canFormCircle) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
    
    public static boolean canFormCircle(String[] strings) {
        int[] indegree = new int[256];
        int[] outdegree = new int[256];
        
        // Calculate indegree and outdegree 
        for (String str : strings) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            outdegree[first]++;
            indegree[last]++;
        }
        
        // Check if all characters have equal indegree and outdegree
        for (int i = 0; i < 256; i++) {
            if (indegree[i] != outdegree[i]) {
                return false;
            }
        }
        
        return true;
    }
}
