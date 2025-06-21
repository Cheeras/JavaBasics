package com.methods;

public class Shadowing {

	static int x=90;//this will be shadowed at line 8

	public static void main(String[] args) {
		System.out.println(x);
		int x = 40;// the class variable at line 5 is shadowed by this
		System.out.println(x);//Scope will begin when value is initialised
		fun();
	}

	static void fun() {
		System.out.println(x);
	}
}
