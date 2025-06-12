package com.interviewQuestions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("After removing duplicates: " + result);
        
    }

    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256]; // For ASCII characters
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
           System.out.println(seen[current]);
            if (!seen[current]) {
                result += current;      // Append only if not seen before
                seen[current] = true;   // Mark as seen
            }
        }
        System.out.println(Arrays.toString(seen));
        return result;
    }
}

