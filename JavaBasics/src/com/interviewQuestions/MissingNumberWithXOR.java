package com.interviewQuestions;

public class MissingNumberWithXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4}; // Missing number is 3
        int n = 6;

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int xor1 = 0; // XOR of all numbers from 1 to n
        int xor2 = 0; // XOR of all elements in the array

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR all elements in the given array
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        // The missing number is xor1 ^ xor2
        return xor1 ^ xor2;
    }
}
