package com.assignments;

public class CheckNumberMultipleOf3Or7 {

	public static void checkNumberMulipleOf3Or7(int num) {

		if (num % 3 == 0 && num % 7 == 0) {
			System.out.println(num + " is multiple of 3 and 7");
		} else if (num % 3 == 0) {
			System.out.println(num + " is multiple of 3");
		} else if (num % 7 == 0) {
			System.out.println(num + " is multiple of 7");
		} else {
			System.out.println(num + " is not multiple of 3 or 7");
		}
	}

	public static void main(String[] args) {

		checkNumberMulipleOf3Or7(3);
		checkNumberMulipleOf3Or7(2);
		checkNumberMulipleOf3Or7(20);
		checkNumberMulipleOf3Or7(21);

	}

}
