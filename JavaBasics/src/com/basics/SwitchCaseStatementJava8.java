package com.basics;

import java.util.Scanner;

public class SwitchCaseStatementJava8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter fruit name:");
		//String fruit =  in.next();
//		switch(fruit) {
//		case "Mango" -> System.out.println("King of fruit");
//		case "Apple" -> System.out.println("A sweet red fruit");
//		case "Orange" -> System.out.println("Round fruit");
//		case "Grapes" -> System.out.println("Small fruit");
//		default -> System.out.println("Please enter valid fruit name");
//		}
		System.out.println("Days of a week");
		int day = in.nextInt();
		
		switch(day) {
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Invalid day");
		}
		in.close();
	}
	

}
