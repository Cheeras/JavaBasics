package com.methods;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
	greeting();
	}
	
static void greeting() {
	Scanner input = new Scanner(System.in);
	System.out.println("enter name : ");
	String name = input.next();
	System.out.println("Happy morning..!");
}
}
	
