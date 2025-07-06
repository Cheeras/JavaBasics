package com.assignments;

public class CharacterType {

	//Check whether a character is a digit, 
	//letter, or special character
	public static void checkCharacterType(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println(ch +" is digit character");
		} else if(Character.isAlphabetic(ch)) {
			System.out.println(ch + " is letter character");
		} else {
			System.out.println(ch + " is special character");
		}
	}
	
	public static void main(String[] args) {
		
		checkCharacterType('2');
		checkCharacterType('Z');
		checkCharacterType('#');
		checkCharacterType('a');

		
	}

}
