package com.ps5;

import java.util.Scanner;

public class LongestPrefixSuffix {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the string: ");
	        String s = scanner.nextLine();
	        
	        int result = findLongestPrefixSuffix(s);
	        System.out.println("Length of longest prefix-suffix: " + result);
	    }

	    public static int findLongestPrefixSuffix(String s) {
	        int n = s.length();
	        int[] lps = new int[n]; // Longest Prefix Suffix array

	      
	        int len = 0; // Length of the previous longest prefix suffix
	        int i = 1;

	        while (i < n) {
	            if (s.charAt(i) == s.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            } else {
	                if (len != 0) {
	                    len = lps[len - 1];
	                } else {
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }

	       
	        return lps[n - 1];
	    }
	}

