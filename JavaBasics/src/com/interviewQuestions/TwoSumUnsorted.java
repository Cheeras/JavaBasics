package com.interviewQuestions;

import java.util.HashMap;

public class TwoSumUnsorted {
    public static int[] twoSumPair(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                return new int[] { complement, num };
            }

            map.put(num, 1);  // We just care about presence, so value can be anything
        }

        return new int[] { -1, -1 };  // If no pair is found
    }

    public static void main(String[] args) {
        int[] nums = {3, 8, 2, 7, 5};
        int target = 10;

        int[] result = twoSumPair(nums, target);
        System.out.println("Pair: " + result[0] + ", " + result[1]);
    }
}
