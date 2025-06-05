package com.basics;

import java.util.Arrays;

public class ArraysBasics {

	public static void main(String[] args) {

		int[] numbers;// Array Declaration - no memory allocation

		numbers = new int[] { 99, 11, 2, 30, 45, 0 };

		System.out.println(Arrays.toString(numbers));

		// Declaration + Allocation

		int[] num = new int[4];
		// creates an array of size 4. Values are auto initilized to 0 for int , null
		// for Objects

		System.out.println("Integer Array with default values " + Arrays.toString(num));

		// num = {10,20,30,40};// this is not allowed out side of array declaration

		// Correct alternative way
		int[] num2 = new int[] { 10, 20, 49, 50 };

		System.out.println(
				"Integer Array with some values assigned" + " during the Array Declaration " + Arrays.toString(num2));

		// How to initialize integer[] array with for loop

		for (int i = 0; i <= num.length - 1; i++) {
			num[i] = (i + 1) * 10;
		}

		System.out.println("Fill Array with for loop " + Arrays.toString(num));
		
		//1.Array of Strings - Manual initialization
		
		String[] names = new String[3];
		names[0]="Alice";
		names[1]="Bob";
		names[2]="Charlie";
		System.out.println("String Array Manual Initialization "+Arrays.toString(names));
		
		//retrieve the above string array using for each loop
		System.out.println("Using for each loop ");
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("================");
		//retrieve the using for loop
		System.out.println("Using for loop"); 
		for(int k=0 ;k < names.length; k++) {
			System.out.println(names[k]);
		}
		
	}

}
