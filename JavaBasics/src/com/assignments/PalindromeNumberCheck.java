package com.assignments;

public class PalindromeNumberCheck {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        return originalNum == reversedNum; // Compare original and reversed
    }

    public static void main(String[] args) {
        System.out.println("Is 121 a palindrome? " + isPalindrome(121)); // true
        System.out.println("Is 123 a palindrome? " + isPalindrome(123)); // false
        System.out.println("Is 1331 a palindrome? " + isPalindrome(1331)); // true
    }
}
