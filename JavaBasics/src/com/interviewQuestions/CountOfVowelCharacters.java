package com.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOfVowelCharacters  {
    public static void main(String[] args) {
        String input = "Hello Beautiful World";  // Example string
        countVowelsWithCharacters(input);
    }

    public static void countVowelsWithCharacters(String str) {
        // Map to store vowel counts
        Map<Character, Integer> vowelMap = new HashMap<>();
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                // Convert to lowercase for case-insensitive counting
                char lowerChar = Character.toLowerCase(ch);
                vowelMap.put(lowerChar, vowelMap.getOrDefault(lowerChar, 0) + 1);
            }
        }

        // Print result
        System.out.println("Vowel counts:");
        for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        int totalVowels = vowelMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total vowels: " + totalVowels);
    }
}
