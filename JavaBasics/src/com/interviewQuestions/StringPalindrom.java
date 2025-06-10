package com.interviewQuestions;

public class StringPalindrom {

	public static void main(String[] args) {

		String input = "LiriLR";//5
		int first = 0;
		int last = input.length()-1;
		boolean isPalidrom = false;
		
		while(first<last) {
			if(input.charAt(first)==input.charAt(last)) {
				first++;
				last--;
				//continue;
			}else {
				System.out.println("Not a String palindrom");
				break;
			}
			isPalidrom = true;
		}
		
		if(isPalidrom) {
			System.out.println("Given String "+ input +" is palidrom string");
		}
	}

}
