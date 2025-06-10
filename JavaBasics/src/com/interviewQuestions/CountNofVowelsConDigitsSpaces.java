package com.interviewQuestions;

public class CountNofVowelsConDigitsSpaces {

	public static void main(String[] args) {
		String input = " TODO 121890 Auto-generat7687687 ed method stub";
		
		int vowels=0,consonants=0,digits=0,spaces=0;
		String inputLower = input.toLowerCase();
		System.out.println(inputLower);
		
		for(int i = 0;i<inputLower.length();i++) {
			char ch = inputLower.charAt(i);
			
			if(ch >='a' && ch<= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}else if(ch>='0' && ch<='9') {
				digits++;
			}else if(ch == ' ') {
				spaces++;
			}
		}
		
		System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
	}

}
