
package com.basics;

public class CallByRef {

	String name;
	int age;
	
	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void t1(CallByRef p1) {// this is called call by reference
		//Main advantage of call by reference is avoiding unnecessary object creation
		// i wan to call m1() method with out creating the new object
		p1.m1(100);
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.name="Tom";
		p1.age=40;
	}
	
	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		System.out.println(obj.name);//default value which is null
		System.out.println(obj.age);//default value of int which is 0
		obj.m1(20);// call by value/argument
		obj.name = "Shankar";
		obj.age = 35;
		CallByRef.t1(obj);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
}
