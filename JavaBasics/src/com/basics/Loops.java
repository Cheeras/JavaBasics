package com.basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		// Print numbers from 1 to 5
		// we can do some thing like this
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		
		/*
		 * for loop syntax
		 * 
		 * for(initialization; condition; increment/decrement){ for body }
		 * 
		 */

		// Q: Print numbers from 1 to 5

		//Initialization will happen only one time
//		for (int num = 1; num <= 5; num += 1) {
//			System.out.println(num);
//		}
//		
		//print numbers from 1 to n 
		Scanner in = new Scanner(System.in);
		//int n = in.nextInt();
//		for(int num = 1; num<=n ; num++) {
////			System.out.print(num + " ");
//			System.out.println("Hello World!");
//		}
		
		//while loop
		/*
		 * syntax:
		 * while(condition){
		 *body
		 * }
		 * */
		//convert above program in while loop
		System.out.println("Using While loop");
		
		int num =1;
		while(num<=5) {
			System.out.println(num + " ");
			num++;
		}
		//when you need to use while loop
		//when you need to use for loop
		//when you do't know how many time loop going to run we will use while 
		//when you know the how many time loop is going run then we will use for loop
		
		//do-while loop
		/*
		 * 
		 * do {
		 * body
		 * }while(condition);
		 *  
		 * */
		System.out.println("Using Do while loop");
		int n = 1;
		do {
			System.out.println(n);
			n++;
		}while(n<=5);
		
	}

}
