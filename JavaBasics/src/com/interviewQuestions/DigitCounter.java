package com.interviewQuestions;

public class DigitCounter {
    public static void main(String[] args) {
        String input = "My phone number is 9876543210 and zip code is 560001";
        int digitCount = countDigits(input);
        System.out.println("Total number of digits: " + digitCount);
    }

    public static int countDigits(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        return count;
    }
}
