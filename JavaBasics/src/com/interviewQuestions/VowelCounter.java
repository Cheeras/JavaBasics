package com.interviewQuestions;

public class VowelCounter {
    public static void main(String[] args) {
        String input = "Hello World";  // You can change this string
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
        }

        return count;
    }
}
