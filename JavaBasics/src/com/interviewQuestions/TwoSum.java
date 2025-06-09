package com.interviewQuestions;

public class TwoSum {

	public static void main(String[] args) {
		//Two Sum - Pair with given Sum
		
		int[] arr = {0, -1, 2, -3, 1};
		
		int target = -2;
		if(twoSum(arr,target)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	//Function to check whether any pair exists
	//whose sum is equal to the target number
	public static boolean twoSum(int[] a, int tar) {
		int n = a.length;
		//iterate through each element in the array
		for(int i=0;i<n;i++) {
			//for each element arr[i], check every 
			//other element arr[j] that comes after it
			for(int j=i+1;j<n;j++) {
				//check if sum of current pair is equal to target 
				if(a[i]+a[j]==tar) {
					return true;
				}
			}
		}
		//if no pair is found after checking all posibilities
		return false;
	}

}
