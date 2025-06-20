package com.interviewQuestions;

public class StringContainingVowels {

	public static void main(String[] args) {

		String str = "str";
		System.out.println(isStringContainsVowel(str));
	}
	
	public static boolean isStringContainsVowel(String str) {
		
		String s = str.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			}
		}
		return false;
	}

}
