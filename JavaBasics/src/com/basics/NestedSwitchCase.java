package com.basics;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int empId = in.nextInt();
		String deptName = in.next();
		switch(empId) {
		case 1 -> System.out.println("shankar Cheerala");
		case 2 -> System.out.println("Rahul Rana");
		case 3 -> {
			System.out.println("Emp number 3");
			switch(deptName) {
			case "IT" -> System.out.println("From IT Department");
			case "Management" -> System.out.println("Management Department");
			case "Finance" -> System.out.println("Finance Department");
			default -> System.out.println("No Department entered");
			}
		}
		default -> System.out.println("Enter correct EmpId");
		}
	}

}
