package com.methods;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {

		//Q: Take an input of 2 numbers and print the sum
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2 ");
		int num2 = input.nextInt();
		
		int sum = num1+num2;
		System.out.println(sum);
		//what if we want print sum of 2 number 100 times
		//do we need to copy past all these lines of code 100 times
		//which is inefficent way of hadling it
		//here we can use methods or functions in java
		
		
	}

}
