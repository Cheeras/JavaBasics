package com.datatypes;

public class MathematicalOperations {

	public static void main(String[] args) {

		System.out.println(1+2);
		System.out.println(5+2);
		System.out.println(10-2);
		System.out.println(10/2);
		System.out.println(9/2);//4 // where is 0.5 
		//9 is int and 2 int 
		
		System.out.println(9.0/2);//4.5
		System.out.println(9.0/2.0);//4.5
		System.out.println(9/2.0);//4.5
		
		//System.out.println(9/0);//infinity
		//java.lang.ArithmeticException: / by zero
		
		System.out.println(0/9);// always zero (0)
		System.err.println(9.0/0);//Infinity// double data type
		System.err.println(9/0.0);//Infinity
		System.err.println(9.0/0.0);//Infinity
		//System.out.println(0/0);////java.lang.ArithmeticException: / by zero
		
		//System.out.println(-1/0);//java.lang.ArithmeticException: / by zero
		
		System.out.println(2/9);//0
		System.out.println(2/9.0);//0
		
		System.out.println(0.0/0.0);//NaN -- not a number
		
		System.out.println(0/0.0);//NaN -- not a number
		
		System.out.println(0.0/0);////NaN -- not a number
		
		//System.out.println(-12/0);//java.lang.ArithmeticException: / by zero
		
		System.out.println(0/9.0);//0.0
		
		System.out.println(10 % 2);// % will get the reminder //0
		
		System.out.println(9 % 2); //1
		
		System.out.println(10 % 4); //2
		
		System.out.println(100 % 3); //1
		

	}

}
