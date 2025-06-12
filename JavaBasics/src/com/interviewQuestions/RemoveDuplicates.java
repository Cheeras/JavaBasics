package com.interviewQuestions;

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
            if (!seen[current]) {
                result += current;      // Append only if not seen before
                seen[current] = true;   // Mark as seen
            }
        }
        return result;
    }
}

