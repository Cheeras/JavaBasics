package com.assignments;

public class SwitchCaseAssignment {

	public static void main(String[] args) {

		int num1 = 125, num2 = 198, num3 = 287;
		findGretest(num1, num2, num3);
		
		
	}
	
	public static void findGretest(int n1, int n2, int n3) {
		int flag = 0;
		if (n1 > n2 && n1 > n3) {
			flag = 1;
			
		} else if (n2 > n3 && n2 > n3) {
			flag = 2;
		} else {
			flag = 3;
		}
		
		switch(flag) {
		case 1:
			System.out.println("Gretest number is : " + n1);
			break;
		case 2:
			System.out.println("Gretest number is : " + n2);
			break;
		case 3:
			System.out.println("Gretest number is : " + n3);
			break;
		default:
			System.out.println("Unexpected case ");
			break;
		}
	}

}
