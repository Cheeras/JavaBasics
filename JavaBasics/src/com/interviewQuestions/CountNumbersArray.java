package com.interviewQuestions;

public class CountNumbersArray {

    static void countNumbers(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers = " + positiveCount);
        System.out.println("Negative numbers = " + negativeCount);
        System.out.println("Zeros = " + zeroCount);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -7, 0, 3};

        countNumbers(arr);
    }
}
