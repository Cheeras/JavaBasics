package com.interviewQuestions;

public class CountWordOccurrence {

	public static void main(String[] args) {
		String sentence = "Welcome to selenium automation Welcome";

		// Split sentence into words
		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i] == null) {
				continue;
			}

			int count = 0;
			String currentWord = words[i];

			for (int j = 0; j < words.length; j++) {
				if(words[j]==null) continue;
		
				if (currentWord.equals(words[j])) {
					count++;
					words[j] = null;
				}
			}

			System.out.println("Word -> " + currentWord + ", Count -> " + count);
		}
	}
}
