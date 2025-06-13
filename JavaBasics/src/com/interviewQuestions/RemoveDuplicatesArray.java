package com.interviewQuestions;

public class RemoveDuplicatesArray {

    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;

        // Sort the array first (so duplicates are consecutive)
        java.util.Arrays.sort(arr);

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            // If it's the first element or different from previous, it's unique
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }

        // Create a new array with the size of unique elements
        int[] unique = new int[j];
        System.arraycopy(temp, 0, unique, 0, j);

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 4, 5};

        int[] unique = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}
