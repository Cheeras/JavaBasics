package com.assignments;

import java.util.Scanner;

public class CenturyYear {


	    public static void checkLeapYear(int year) {
	        if (year <= 0) {
	            System.out.println("Invalid year.");
	        } else if (year % 400 == 0) {
	            System.out.println(year + " is a Leap Year (Century Year and divisible by 400).");
	        } else if (year % 100 == 0) {
	            System.out.println(year + " is NOT a Leap Year (Century Year but not divisible by 400).");
	        } else if (year % 4 == 0) {
	            System.out.println(year + " is a Leap Year.");
	        } else {
	            System.out.println(year + " is NOT a Leap Year.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        checkLeapYear(year);
	        scanner.close();
	    }
	}