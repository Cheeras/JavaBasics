package com.assignments;

public class CheckNumberDivisibleBy5And11 {

	public static void numberDivisibleBy5And11(int num) {
		if(num % 5 ==0 && num % 11 == 0) {
			System.out.println(num + " Number Divisible by 5 and 11 ");
		} else {
			System.out.println(num + " Number Not Divisible by 5 and 11 ");
		}
	}
	
	public static void main(String[] args) {
		
		numberDivisibleBy5And11(55);
		numberDivisibleBy5And11(5);
		numberDivisibleBy5And11(10);
		

	}

}
