package com.interviewQuestions;

public class ReverseSentenceWordByWord {

	public static void main(String[] args) {

		String statement = "Welcome to Selenium Java";

		// using for loop
		String[] Words = statement.split(" ");
		String reverseStament = "";
		//String reverseWord = "";

		System.out.println(Words[0].length());
		for (int i = 0; i < Words.length; i++) {
			String reverseWord = "";
			for (int j = Words[i].length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + Words[i].charAt(j);
			}
			reverseStament = reverseStament + reverseWord + " ";
		}
		System.out.println("Reversed Sentenace word by word \n"+reverseStament);
	}

}
