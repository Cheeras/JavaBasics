package com.assignments;

public class CharCaseChecker {

	//check if character is uppercase or lowercase
	
	public static void checkCharacter(char ch) {
		
		if(Character.isLowerCase(ch)) {
			System.out.println(ch +" is lower case");
		} else if(Character.isUpperCase(ch)) {
			System.out.println(ch +" is upper case");
		}
		
	}
	
	public static void main(String[] args) {
		checkCharacter('A');
		checkCharacter('b');

	}

}
