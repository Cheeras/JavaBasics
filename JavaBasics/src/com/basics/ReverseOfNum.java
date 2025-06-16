package com.basics;

public class ReverseOfNum {

	public static void main(String[] args) {

		int num = 23597;
		//output = 79532
		/**
		 * first we need to get the 7 from 23597 how will you get this
		 * by using modulus opertion(%)
		 * num = num%10= 7 as reminder
		 * rev is a integer type to hold the reverse of a number
		 * rev = rev*10 + num;
		 * num = num/10=2359
		 * 2359>0
		 * 
		 * */
		
		int rev=0;
		while(num>0) {
			int rem = num%10;
			num /= 10;
			rev = rev *10+rem;
			
		}
		
		System.out.println(rev);
	}

}
