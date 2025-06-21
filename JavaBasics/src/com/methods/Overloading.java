package com.methods;

public class Overloading {

	public static void main(String[] args) {
		fun(67);
		fun("Shankar Cheerala",100);
		fun(100,"Jayedev Cheerala");
	}
	
	/*
	 * Two methods are said to overloaded method
	 * 	1. They should have same method
	 * 	2. Type of argument should be different
	 * 	3. Order of argument should be different
	 * */
	static void fun(int a) {
		System.out.println(a);
	}
	static void fun(String name,int n) {
		System.out.println(name);
	}
	static void fun(int n, String str) {
		System.out.println(str);
	}
	static int fun() {// return type is not of method signature
		return 1;
	}
	
	
}
