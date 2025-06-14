package com.interviewQuestions;

public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Welcome to selenium automation";

        char[] arr = input.toCharArray();

        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length ||
                arr[i] == ' ') {

                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        String output = new String(arr);
        System.out.println("Output: " + output);
    }

    // Helper method to reverse a range in array in place
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}

