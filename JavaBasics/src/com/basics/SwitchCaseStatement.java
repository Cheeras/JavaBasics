package com.basics;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		switch (day) {
		case 1,2,3,4,5 -> System.out.println("Week day");
		case 6,7 -> System.out.println("Week end");
		default ->
		throw new IllegalArgumentException("Unexpected value: " + day);
		}
		//in.close();
	}

}
