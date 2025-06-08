package com.interviewQuestions;

public class FindAsciiCharacter {

	public static void main(String[] args) {

		char ch = 's';
		System.out.println((byte)ch);//by type casting into byte//recommended
		System.out.println((int)ch);//by type casting into int
		System.out.println(ch+0);//by adding the 0 to it
	}

}
