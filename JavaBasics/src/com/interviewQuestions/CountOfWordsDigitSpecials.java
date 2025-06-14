package com.interviewQuestions;

public class CountOfWordsDigitSpecials {

	public static void main(String[] args) {
		String sentence = "Welcome to selenium@@@@ automation Welcome 2025!!!!";
		//String sentence = "Welcome to Selenium automation 2025!";

		String[] words = sentence.trim().split("\\s+");

		int wordCount = words.length;

		int characterCount = 0;
		int digitCount = 0;
		int specialCount = 0;

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (Character.isLetter(ch)) {
				characterCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else if (!Character.isWhitespace(ch)) {
				specialCount++;
			}
		}

		System.out.println("Words = " + wordCount);
		System.out.println("Characters = " + characterCount);
		System.out.println("Digits = " + digitCount);
		System.out.println("Special Characters = " + specialCount);

	}

}
