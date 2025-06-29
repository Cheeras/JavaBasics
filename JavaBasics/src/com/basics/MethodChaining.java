package com.basics;

public class MethodChaining {
	MethodChaining obj ;
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		//t1();
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		MethodChaining obj2 = new MethodChaining();
		obj2.m3();
	}
	
	//non static method calling non static - direct calling(no object creation is required)
	//static method calling static method -- direct/using the class name
	//non static method calling static -- direct/using the class name
	//Static method calling non static -- create object and call it
	
	/*
	 * Here in this class we are creating 2 objects for the MethodChaining
	 * at line number 33 we are creating one more object for the MethodChaining class
	 * 
	 * */

	public static void main(String[] args) {

		//creating the object of the class
		MethodChaining obj = new MethodChaining();
		obj.m1();
		MethodChaining.t1();
		
		
	}

}
