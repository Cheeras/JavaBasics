package com.assignments;

public class LargestOfFourNumbers {

	public static void main(String[] args) {

		int a=300,b=98,c=121,d=231;
		//find the largest of the 4 numbers
		//output: 231
		
		findLargest(a,b,c,d);
	}
	
	public static void findLargest(int a,int b, int c, int d) {
		
		if(a > b && a > c && a > d) {
			System.out.println("Gretest number is : " + a);
		} else if (b > a && b > c && b > d) {
			System.out.println("Gretest number is : " + b);
		} else if(c > a && c > b && c > d){
			System.out.println("Gretest number is : " + c);
		}else {
			System.out.println("Gretest number is : " + d);
		}
	}

}
