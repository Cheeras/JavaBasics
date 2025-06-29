package com.basics;

public class TestMethod {

	public void getMail() {
		System.out.println("get Mail");
	}

	public static void sendMail() {
		System.out.println("send mail");
	}
	//Can static method is overloaded
	//we can overloaded static method
	//Can we overload non static method
	//Yes can overload the non static method
	
	public static void sendMail(int a) {
		System.out.println("Send mail with int parameter");
	}
	
	//can i overload the main method 
	//yes we can overload the main method
	public static void main(String[] args) {

		// how to call static methods:
		// 1. using the class name
		TestMethod.sendMail();
		// 2. with in the same class, use it directly
		sendMail();
		// how to call non static methods: we need to create the object
		TestMethod test = new TestMethod();
		test.getMail();
		test.sendMail();
	}
}
