package com.interviewQuestions;

public class FirstNonRepeatingWithoutCollections {
    public static void main(String[] args) {
        String input = "aabbccdeeffg";
        char result = findFirstNonRepeatingChar(input);

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // Step 1: For ASCII characters

        // Step 2: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Step 3: Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i); // First unique character
            }
        }

        return 0; // Step 4: No non-repeating character
    }
}
