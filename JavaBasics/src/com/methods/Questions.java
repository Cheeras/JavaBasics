package com.methods;

import java.util.Scanner;

public class Questions {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		System.out.println(isPrime(num));
	}

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		int count = 2;
		while (count * count <= n) {

		}
		return true;
	}
}
