package com.ps5;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the number of vowels to count from the end: ");
        int n = scanner.nextInt();

        String lastNVowels = getLastNVowels(input, n);

        if (lastNVowels.equals("Mismatch in Vowel Count")) {
            System.out.println("Mismatch in Vowel Count");
        } else {
            System.out.println("Last " + n + " vowels from the end: " + lastNVowels);
        }
    }

    public static String getLastNVowels(String str, int n) {
        int vowelCount = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                sb.insert(0, ch);
            }
            if (vowelCount == n) {
                break;
            }
        }

        if (vowelCount < n) {
            return "Mismatch in Vowel Count";
        }

        return sb.toString();
    }
}
