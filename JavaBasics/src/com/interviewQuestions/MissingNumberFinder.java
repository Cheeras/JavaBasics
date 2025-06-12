package com.interviewQuestions;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of 1 to n
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i]; // Sum of given array
        }

        return expectedSum - actualSum; // The difference is the missing number
    }
}

