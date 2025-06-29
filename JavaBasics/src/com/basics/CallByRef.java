package com.basics;

public class CallByRef {

	String name;
	int age;
	
	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void t1(CallByRef p1) {// this is called call by reference
		// i wan to call m1() method with out creating the new object
		p1.m1(100);
	}
	
	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		obj.m1(20);// call by value/argument
		CallByRef.t1(obj);
	}

}
