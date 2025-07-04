package com.assignments;

import java.util.Scanner;

public class PostiveOrNegativeOrZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		
		checkNumberSign(num);
		sc.close();
	}
	
	public static void checkNumberSign(int num) {
		String sign = null;
		if(num == 0 ) {
			sign = "Zero";
		} else if(num < 0) {
			sign = "Negative";
		} else {
			sign = "Positive";
		}
		System.out.println(sign);
	}

}
