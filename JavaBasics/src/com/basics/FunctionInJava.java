package com.basics;

public class FunctionInJava {
	//function / method in java
	//it will give reusability of the code
	//no input -- no return
	//input -- return
	//input -- no return
	//no input - return
	
	//functions are independent to each other
	//functions are parallel to each other
	
	//1.no input and no return:
	//void -- no return, function does not return anything(no return keyword)
	public void test() {
		System.out.println("I am from the test method");
	}
	//no input(no of parameter) and no return:
	//zero parameter
	public void calc() {
		System.out.println("Calc method");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	//2.no input(no of parameters) with some return
	//return type of this function is int
	public int getNumber() {
		System.out.println("getNumber");
		int fee=100;
		int tax=20;
		int totalfee = fee+tax;
		return totalfee;
	}
	public static void main(String[] args) {
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		obj.calc();
		System.out.println(obj.getNumber());
	
	}

}
