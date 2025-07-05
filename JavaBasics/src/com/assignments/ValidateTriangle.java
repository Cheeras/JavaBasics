package com.assignments;

public class ValidateTriangle {

	
	public static void tringleValidation(int a1,int a2,int a3) {
		int sum = a1+a2+a3;
		if(a1 > 0 && a2 > 0 && a3 > 0 && (sum == 180)) {
			System.out.println("Valid triangle.");
		} else {
			System.out.println("InValid Triangle ");
		}
	}
	
	public static void checkTypeOfTriangle(int a1,int a2,int a3) {
		if (a1 <= 0 || a2 <= 0 || a3 <= 0 || (a1 + a2 + a3 != 180)) {
            System.out.println("Invalid Triangle");
        } else if (a1 == 60 && a2 == 60 && a3 == 60) {
            System.out.println("Equilateral Triangle");
        } else if (a1 == 90 || a2 == 90 || a3 == 90) {
            System.out.println("Right-Angled Triangle");
        } else if (a1 == a2 || a2 == a3 || a1 == a3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
		
	}
	public static void main(String[] args) {

		tringleValidation(60, 60, 60);
		tringleValidation(60, 70, 60);
		tringleValidation(60, 100, 60);
		
		checkTypeOfTriangle(60, 60, 60);   // Equilateral
        checkTypeOfTriangle(90, 45, 45);   // Right-Angled
        checkTypeOfTriangle(70, 70, 40);   // Isosceles
        checkTypeOfTriangle(80, 60, 40);   // Scalene
        checkTypeOfTriangle(100, 50, 40);  // Invalid
		
	}

}
