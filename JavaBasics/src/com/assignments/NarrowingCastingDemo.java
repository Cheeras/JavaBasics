package com.assignments;

public class NarrowingCastingDemo {

	/*
	 * Narrowing Casting Assignment: Develop a java program to illustrate narrowing casting. 
	 * Declare variables of higher data types like double,float,long, etc., and assign values to them
	 * Then, case these variables to lower data types like int,short,byte, etc. Print out the Original
	 * and casted values to observed narrowing casting in action.
	 * */
	
	public static void main(String[] args) {
		
		double d = 3435.565;
		float f = 777.88f;
		long l = 898989;
		
		System.out.println("Before Narrowing Casting");
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println("After Narrowing Casting");
		System.out.println((int)d);
		System.out.println((short)f);
		System.out.println((int)l);
	}
	
}
