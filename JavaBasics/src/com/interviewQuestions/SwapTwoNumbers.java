package com.interviewQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		// with out using temp varaible
		int a = 10, b = 20;
		// output a=20, b=10;
		System.out.println("Before Swap with out temp: a=" + a + ", b= " + b);
		a = a + b;// 30
		b = a - b;// 10
		a = a - b;// 20
		System.out.println("After Swap with out temp: a=" + a + ", b= " + b);

		// With XOR Operation
		System.out.println("Before Swap using XOR : a=" + a + ", b= " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swap Using XOR : a=" + a + ", b= " + b);

		// With Swap separate method
		int[] arr = { 30, 80 };
		System.out.println("Before swap using swapNumbers: a = " + arr[0] + ", b = " + arr[1]);

		swapNumbers(arr);

		System.out.println("After swap using swapNumbers: a = " + arr[0] + ", b = " + arr[1]);
	}

	static void swapNumbers(int[] arr) {
		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];

	}
}
