package com.interviewQuestions;

public class StringCompressionWithOutCollection {

	public static void main(String[] args) {

		String input = "aabcccccaaa";
		//a2b1c5a3
		String compressed = compress(input);
		System.out.println(compressed);
	}
	
	public static String compress(String str) {
		
		if(str == null || str.isEmpty()) return str;
		
		
		String result ="";
		String processed ="";
		
		for(int i =0;i<str.length();i++) {
		char current = str.charAt(i);
			if(processed.indexOf(current) != -1) {
				continue;
			}
		int count =0;
		
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j) == current) {
				count++;
			}
		}
				
		result = result + current + count;
		processed = processed + current;
		}
		
		return result;
	}

}
