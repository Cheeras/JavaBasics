package com.basics;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		//find the largest of 3 numbers
		int max = a;
		if(b > max) {
			max = b;
		} if (c > max) {
			max = c;
		}
		
		System.out.println(max);
		in.close();
		
	}

}
