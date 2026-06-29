package timecomplexity;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {90,8,11,34,89,23,67,99,56};
		
		//find the index of 99
		//what is time complexity fetch on specific index is O(1)
		//Print the all the values of the array O(n)
		//Time complexity of reading excel file O(n^2)
		int target = 90;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index = binarySeach(arr, 90);
		if(index!=-1) {
			System.out.println("Element found at index: "+index);
		}else {
			System.out.println("Element not found");
		}
//		int start = 0;
//		int end = arr.length-1;
//		
//		
//		while(start<=end) {
//			//find the middle index
//			int mid = (start+end)/2;
//			//Target found
//			if(arr[mid] == target) {
//				System.out.println("Element found at index: "+mid);
//				return;
//			}else if(target>arr[mid]) {
//				start = mid + 1;
//			}else {
//				end = mid - 1;
//			}
//		}
//		System.out.println("Element not found");
		
	}
	
	public static int binarySeach(int [] arr,int target) {
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
		int mid = (start+end)/2;
		if(arr[mid]==target) {
			//System.out.println("Element found at index : "+ mid);
			return mid;
		}else if(target>arr[mid]) {
			start = mid+1;
		}else {
			end = mid- 1;
		}
		}
		return -1;
	}

}
