package com.assignments;

public class CharacterChecker {

	
	public static void checkCharacter(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch>='a' && ch <='z') {
		if(ch == 'a'|| ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " : is a Vowel");
		}else {
			System.out.println(ch + " : is a Consonent");
		}
		}else {
			System.out.println(ch + " : is not an alphabet letter.");
		}
	}
	public static void main(String[] args) {

		checkCharacter('e');
		checkCharacter('A');
		checkCharacter('S');
		checkCharacter('@');
		checkCharacter('u');
		
	}

}
