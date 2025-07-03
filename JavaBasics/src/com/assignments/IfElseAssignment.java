package com.assignments;

public class IfElseAssignment {

	/*
	 * if-else - Conditional Operators
	 * 
	 * Q-1.a Find out the greatest number out of three different given numbers
	 */
	public static void main(String[] args) {
		int num1 = 125, num2 = 198, num3 = 287;
		findGretest(num1, num2, num3);

	}

	public static void findGretest(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			System.out.println("Gretest number is : " + n1);
		} else if (n2 > n3 && n2 > n3) {
			System.out.println("Gretest number is : " + n2);
		} else {
			System.out.println("Gretest number is : " + n3);
		}
	}

}
