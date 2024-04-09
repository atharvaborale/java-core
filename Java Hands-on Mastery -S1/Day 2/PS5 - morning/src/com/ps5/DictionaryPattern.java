package com.ps5;

import java.util.Scanner;

public class DictionaryPattern {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner sc=new Scanner(System.in);

	    System.out.print("Enter the number of strings you want to enter: ");
	    int numStrings = Integer.parseInt(scanner.nextLine());
	    
//	    System.out.print("Enter the pattern :");
//	    String pattern =scanner.next();
	    String pattern="foo";

	    String[] dictonary = new String[numStrings];

	    for (int i = 0; i < numStrings;) {
	      System.out.println("Enter String " + (i+1) + ": ");
	      dictonary[i] = scanner.nextLine();
	      i++;
	      
   
	    }
	    findMatches(dictonary, pattern);
	    System.out.println("The entered strings are:");
	    for (String str :  dictonary) {
	      System.out.println(str);}
       
	}

	public static void findMatches(String[] dictonary, String pattern) {
        for (String word : dictonary) {
            if (isMatch(word, pattern)) {
                System.out.println(word);
            }
        }
    }

    public static boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        int[] wordCount = new int[26];
        int[] patternCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            wordCount[word.charAt(i) - 'a']++;
            patternCount[pattern.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (wordCount[i] != patternCount[i]) {
                return false;
            }
        }

        return true;
    }
	}
