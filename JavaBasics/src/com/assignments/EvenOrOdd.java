package com.assignments;

public class EvenOrOdd {

	public static void main(String[] args) {

		checkNumberEvenOrOdd(0);
		checkNumberEvenOrOdd(2);
		checkNumberEvenOrOdd(3);
		checkNumberEvenOrOdd(-100);
		
		System.out.println("5 is :  "+getEvenOrOdd(5));
		System.out.println("44 is :  "+getEvenOrOdd(44));

	}

	public static void checkNumberEvenOrOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("Odd");
		}
	}

	// using ternary operator
	public static String getEvenOrOdd(int num) {

		return (num % 2 == 0) ? "even" : "odd";
	}

}
