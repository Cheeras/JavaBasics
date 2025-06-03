package com.interviewQuestions;

public class SecondHighestArray {

	public static void main(String[] args) {

		//int arr[] = {11,78,45,23,44,47,4};//length 7//index 0-6
		/*
		 * Testcases to be validated
		 * int arr[] = {11,78,45,23,44,47,4};//47
		 * int arr[] = {11,78};//11
		 * int arr[] = {11};//Array must contains atleast 2 elements. and exit the entire main method
		 * int arr[] = {11,11};//There is no second highest element
		 * 
		 * */
		int arr[] = {11,11};
		
		
		//System.out.println(arr.length);
		//Find the second highest number form the array
		if(arr.length < 2) {
			System.out.println("Array must contains atleast 2 elements.");
			return;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int number : arr) {
			if(number > first) {
				second = first;
				first = number;
			} else if(number > second && number!=first) {
				second = number;
			}
		}
		
		if(second == Integer.MIN_VALUE) {
			System.out.println("There is no second highest element");
		}else {
			System.out.println("The second highest number is: " + second);
		}
		
	}

}
