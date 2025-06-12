package com.interviewQuestions;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        /*✅ What is an Anagram?
				Two strings are anagrams if:
				They have the same length
				They contain the same characters, just possibly in a different order
		🔸 Example:

			"listen" and "silent" → ✅ anagrams
			"triangle" and "integral" → ✅ anagrams
			"apple" and "papel" → ✅ anagrams
			"hello" and "world" → ❌ not anagrams*/

        boolean result = isAnagram(str1, str2);
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256]; // ASCII size

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++; // count the character from s1
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--; // remove the character from s2
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
