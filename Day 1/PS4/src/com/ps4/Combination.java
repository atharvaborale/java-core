package com.ps4;

import java.util.Scanner;

public class Combination {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] nums = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            nums[i] = Integer.parseInt(strArray[i]);
        }
        System.out.print("Enter the length of combinations (k): ");
        int k = scanner.nextInt();

        findCombinations(nums, k);
    }

    public static void findCombinations(int[] nums, int k) {
        int[] combination = new int[k];
        combine(nums, combination, 0, 0, k);
    }

    private static void combine(int[] nums, int[] combination, int start, int index, int k) {
        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.print(combination[i]);
                if (i != k - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < nums.length; i++) {
            combination[index] = nums[i];
            combine(nums, combination, i + 1, index + 1, k);
        }
    }
}
