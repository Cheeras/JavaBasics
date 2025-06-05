package com.interviewQuestions;

public class StringReverse {

	public static void main(String[] args) {

		//String reverse with out using any predefined methods
		String name = "Shankar";
		String reverse = "";
		
		//Method-1 using for loop
		for(int i=name.length()-1;i>=0;i--) {
			reverse += name.charAt(i);
		}
		
		System.out.println(reverse);
		
		//Explanation
		//Loop end to start
		//Builds reversed String one character at a time
		//Less efficient due to string immutability(creates new object each time)
		
		//Method-2 - Using StringBuilder - Most efficient method
		
		String input = "Automation";
		
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		
		System.out.println(sb.toString());
		
		//Explantion
		//Fast and memory efficient
		//Uses mutable StringBuilder
		
		//Method -3 - Using char array
		
		String input2 = "Selenium";
		char[] chars = input2.toCharArray();
		
		for(int i=0,j = input2.length()-1;i<j;i++,j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		
		System.out.println(new String(chars));
	}

}
