package com.assignments;

public class WideningCastingDemo {

	public static void main(String[] args) {

		/*Widening Casting Assignment: 
		 * Write a Java program that demonstrates widening casting.
		 * Create variables of different data types such as int, float,
		 * double, etc. Assign values to them and then cast them to a 
		 * higher data type. Finally, print out the original and casted 
		 * values to observe widening casting in action*/
		
		/*
		 * byte-->short-->int-->long-->float-->double
		 * char-->int
		 * */
		
		byte b = 100;
		short s = 200;
		int a =129;
		long l = 15471;
		float f = 23.45f;
		double d = 586.56;
		char ch = 'a';
		System.out.println("Before the windening.");
		System.out.println("byte value: "+b);
		System.out.println("short value: "+s);
		System.out.println("int value: "+a);
		System.out.println("float value: "+f);
		System.out.println("double value: "+d);
		System.out.println("char value: "+ch);
		System.out.println("After the windening.");
		System.out.println("byte value: "+(int)b);
		System.out.println("short value: "+(long)s);
		System.out.println("int value: "+(float)a);
		System.out.println("float value: "+(double)f);
		System.out.println("double value: "+d);
		System.out.println("char value: "+(int)ch);
		
	}
	

}
