package com.interviewQuestions;

import java.util.Arrays;

public class MoveZerosEnd {

	public static void main(String[] args) {
		int arr[] = {11,99,0,23,12,0,89,0,67,56,0};
		//move the zeros to the end of the array with out using the another array
		
		//11,99,23,12,89,67,56,0,0,0,0
		
		int j =0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]!=0) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
