package com.interviewQuestions;

public class CountOfPairs {

	public static void main(String[] args) {
		int[] arr = {1,5,7,-1,5};//index 0-4//lenght =5
		int sum = 6;
		findPairs(arr,sum);
	}
	
	public static void findPairs(int[] arr,int sum) {
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == sum){
					System.out.println("("+arr[i]+", "+arr[j]+")");
				}
			}
		}
		
	}

}
