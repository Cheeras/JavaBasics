package com.basics;

public class TestExecution {

	// a method is calling itself -- recursive function: recursion
	public static void getNum() {
		System.out.println("get Num");
		getNum();// stack overflow error
	}

	public static void main(String[] args) {
		TestExecution.getNum();
	}
}
