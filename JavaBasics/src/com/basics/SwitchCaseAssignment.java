package com.basics;

import java.util.Scanner;

public class SwitchCaseAssignment {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the fuit name: ");
		String fruit = in.next();

		switch(fruit) {
		case "Mango":
			System.out.println("King of all fruits");
			break;
		case "Apple":
			System.out.println("A sweet red fruit");
			break;
		case "Organe":
			System.out.println("Roudn fruit");
			break;
		case "Grapes":
			System.out.println("Small fruit");
			break;
		default:
			System.out.println("Please enter valid fruit");
		}
		in.close();
		
	}

}
