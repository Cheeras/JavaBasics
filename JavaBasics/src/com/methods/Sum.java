package com.methods;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		System.out.println(sum3(20,40));
	}
	//pass the values of numbers when you are calling the method in main()
	/*
	 * return_type method_name(){
	 * 	//method body
	 *  return statement
	 * }
	 * 
	 * 
	 * */

	static int sum3(int a, int b) {
		int sum = a + b;
		return sum;
	}
	static void sum2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2 ");
		int num2 = input.nextInt();
		
		int sum = num1+num2;
		System.out.println(sum);
	}
  static int sum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2 ");
		int num2 = input.nextInt();
		
		int sum = num1+num2;
		return sum;
	}
}
