package com.interviewQuestions;

public class CountOfCharactersWithOutCollection {
	
	public static void main(String[] args) {
		String str = "Hello world";
		int[] freq = new int[256];//ASCII SIZE
		for(char ch : str.toCharArray()) {
			if(ch == ' ') continue;
			freq[ch]++;
		}
		
		for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char)i + "': " + freq[i]);
            }
        }
	}

}
