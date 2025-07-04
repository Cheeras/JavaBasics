package com.assignments;

public class LargetOfTwo {

	public static void main(String[] args) {

		largestOfTwo(10, 20);
		largestOfTwo(100, 20);
		largestOfTwo(100, 100);
		
		int result = getLargest(10, 10);
		if(result == 0) {
			System.out.println("Both are Equall");
		} else {
			System.out.println(result + " is the largest");
		}
		System.out.println("Largest is : "+getLargest(10, 20));
		System.out.println("Largest is : "+getLargest(200, 20));
		System.out.println("Largest is : "+getLargest(10, 10));

	}

	public static void largestOfTwo(int a, int b) {

		if (a > b) {
			System.out.println(a + " is larger");
		} else if (b > a) {
			System.out.println(b + " is larger");
		} else {
			System.out.println("both are equal");
		}

	}

	// Using ternary operator

	public static int getLargest(int a, int b) {
		if(a== b) return 0;
		return (a > b) ? a : b;
	}

}
