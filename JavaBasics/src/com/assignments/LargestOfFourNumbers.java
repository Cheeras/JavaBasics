package com.assignments;

public class LargestOfFourNumbers {

	public static void main(String[] args) {

		int a=300,b=98,c=1221,d=231;
		//find the largest of the 4 numbers
		//output: 231
		
		findLargest(a,b,c,d);
	}
	
	public static void findLargest(int a,int b, int c, int d) {
		int largest = 0;
		if(a > b && a > c && a > d) {
			largest = a;
		} else if (b > a && b > c && b > d) {
			largest = b;
		} else if(c > a && c > b && c > d){
			largest = c;
		}else {
			largest = d;
		}
		System.out.println("Gretest number is : " + largest);
	}

}
