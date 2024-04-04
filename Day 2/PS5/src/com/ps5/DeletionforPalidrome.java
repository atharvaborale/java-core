package com.ps5;

import java.util.Scanner;

public class DeletionforPalidrome {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();
	        
	        int deletions = minDeletionsForPalindrome(str);
	        System.out.println("Minimum number of deletions to make the string palindrome: " + deletions);
	        
	    }
	    
	    public static int minDeletionsForPalindrome(String str) {
	        int n = str.length();
	        int[][] dp = new int[n][n];
	        
	        
	        for (int i = n - 1; i >= 0; i--) {
	            for (int j = i + 1; j < n; j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1];
	                } else {
	                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
	                }
	            }
	        }
	        
	        return dp[0][n - 1];
	    }
}
