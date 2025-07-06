package com.assignments;

public class SimpleCalculator {
//Simple calculator using if-else (add, subtract, multiply, divide)
	public static void calculator(int a, int b,char operator) {
		double result;
		
		switch(operator) {
		case '+':
			System.out.println("Sum of two number is "+(a+b));
			break;
		case '-':
			int sub = a > b ? (a-b) : (b-a);
			System.out.println("Subtraction of two number is "+sub);
			break;
		case '/':
			 if (b == 0) {
                 System.out.println("Error: Cannot divide by zero.");
             } else {
                 result = a / b;
                 System.out.println("Division of two numbers is : " + result);
             }
			break;
		case '*':
			System.out.println("Multiplication of two numbers is "+(a*b));
			break;
		default:
			System.out.println(operator +" is not supported by calculator");
			break;
		}
		
	}
	public static void main(String[] args) {

		calculator(10,20,'+');
		calculator(10,20,'-');
		calculator(10,20,'*');
		calculator(10,20,'/');
		calculator(10,20,'$');
	}

}
