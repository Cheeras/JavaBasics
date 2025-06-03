package com.interviewQuestions;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		//int arr[] = {11,78,45,23,44,47,4,12};//length 8//index 0-7
		
		int arr[] = {11};
		System.out.println("Original Array : "+Arrays.toString(arr));
		//using 2 pointer method
		if(arr.length < 2) {
			System.out.println("Array should contain atleast 2 element for reverse");
			return;
		}
		
		int first = 0;
		int last = arr.length-1;
		while(first<last) {// 0<7//1<6//2<5//3<4
			int temp = arr[first];//11//78//45//23
			arr[first] = arr[last];//12//4//47//44
			arr[last] = temp;//11//78//45//23
			first++;//1//2//3//4
			last--;//6//5//4//3
		}
		System.out.println("Reversed Array : "+Arrays.toString(arr));
		
	}

}
