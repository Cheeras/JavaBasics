package com.basics;

import java.util.Scanner;

public class SwitchCaseStatementJava8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter fruit name:");
		String fruit =  in.next();
		switch(fruit) {
		case "Mango" -> System.out.println("King of fruit");
		case "Apple" -> System.out.println("A sweet red fruit");
		case "Orange" -> System.out.println("Round fruit");
		case "Grapes" -> System.out.println("Small fruit");
		default -> System.out.println("Please enter valid fruit name");
		}
		in.close();
	}
	

}
