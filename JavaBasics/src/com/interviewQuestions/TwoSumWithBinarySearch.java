package com.interviewQuestions;

import java.util.Arrays;

public class TwoSumWithBinarySearch {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            int index = binarySearch(numbers, i + 1, numbers.length - 1, complement);
            if (index != -1) {
                return new int[] { numbers[i] , numbers[index] };
                //return new int[] { i+1 , index+1 };
                
            }
        }
        return new int[] { -1, -1 };
    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(numbers, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println(Arrays.toString(result));
    }
}
