package com.interviewQuestions;

public class FindLargestInArray {

	public static void main(String[] args) {

		int arr[] = {11,99,22,0,51,78,9};//length 6//0-5
		//output is 99
		int max = Integer.MIN_VALUE;
		//System.out.println(max);
		//using for loop
		
		for(int i=0;i<=arr.length-1;i++) {//6
			if(arr[i]>max) {
				max=arr[i];//99
			}
		}
		
		System.out.println(max);
		
		
	}

}
