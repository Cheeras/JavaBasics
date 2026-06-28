package arrays;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		/**
		 * Array:
		 * similar type of data in a collection
		 * 
		 * 1.static Array: size is fixed
		 * 2.Dynamic Array: dynamic array,size is not fixed:Array List
		 * 
		 * */
		
		//Array declaration
		int arr [] = new int[4];
//		System.out.println(arr[0]);//0
//		System.out.println(arr[3]);//0
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//arr[-1] = 50;
		//System.out.println(arr[-1]);
		//java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 4
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		//System.out.println(arr[4]);
		
		//Formula of the array
		
		System.out.println("Lowest Index = "+ 0);
		int len = arr.length;
		System.out.println("Lenght = "+ len);
		System.out.println("Highest Index "+ (len-1));
		
		//what if i want to print all the values of the array
		//if you using the i<=
		//arr.length-1 other wise it will AIOBE
		for(int i = 0;i<=arr.length-1 ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------");
		
		for(int i = 0;i< arr.length ;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		
		//how to print the array with using the loop
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------");
		
		//we can fill the index 1 with out filling the index 0 
		//we will not get any exception or error
		int p[] = new int[3];
		p[1] = 100;
		System.out.println(p[1]);
		
		System.out.println("-----------------");
		/*
		 * Notes:
		 * Once we declare an array if you are not initializing any values by default it will 
		 * take default values for example 
		 * 
		 * int [] arr = new int[4];//Array declaration
		 * System.out.println(arr[0]);//0
		 * System.out.println(arr[1]);//0
		 * System.out.println(arr[2]);//0
		 * System.out.println(arr[3]);//0
		 * 
		 * why all the array values to zero because array is of type int and 
		 * integer default value is 0
		 * 
		 * in similar way if we are declaring the String array and not initializing any values
		 * by default it will take null because string default value is null
		 * 
		 * Similarly for other as well
		 * */
		
		String strArr[] = new String[2];
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		
	}

}
