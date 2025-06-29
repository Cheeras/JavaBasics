package com.basics;

public class MainMethodOverloading {
	
	/*Why main method is static in nature
	 *No need to create object 
	 *JVM no need to create the object 
	 * */

	// JVM - PSVM(String args[])
	public static void main(String[] args) {

		System.out.println("hello");
		MainMethodOverloading.main(100);
		MainMethodOverloading.main(10, 20);

	}

	public static void main(int a) {
		System.out.println("Hi " + a);
	}

	public static void main(int a, int b) {
		System.out.println("Bye " + (a + b));
	}

}
