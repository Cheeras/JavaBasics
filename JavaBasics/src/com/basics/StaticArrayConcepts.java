package com.basics;

import java.util.Arrays;

public class StaticArrayConcepts {

	public static void main(String[] args) {
		
		//integer array
		//array is collection of similar data type
		//array size is fixed
		//1. Static array : size is fixed
		//2. dynamic array : dyanmic size , size is not fixed // ArrayList
		
		//two major limitaions of arrays is 
		//1.size is fixed - that why it is called static array 
		//2.It can store similar data type - we can use object array - but still it is static array
		
		//How to solve the problem
		//by using the ArrayList
		
		//Then the Question is where to use Array concept and where to use ArrayList Concept
		
		//Real time usecase for array is 
		//flight booking
		//bus booking
		//movie ticket booking -- where the size is fixed
		
		//for example Uber booking - can we use array we can not use
		//we never know how many booking will come during the peak time 
		//in this case we will use ArryList
		//One more good example of 
		//Zomato - number of restarents 
		//can the no of restarents are fixed no right because we will get see more
		//number of restarents will be coming in our area
		
		//interms of automation where to Array and ArrayList
		//footer information of any website - is always fixed - i will go for Array here
		
		//first way of declaring the array
		int arr[] = new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//another way of declaring the array
		int arr1[] = {10,20,30,40};
		System.out.println(Arrays.toString(arr1));
		//To print the array values with out loop we can user Arrays.toString() method
		
		System.out.println(Arrays.toString(arr));
		
		
		//print the array elements using for loop
		//In array we have length variable not a method
		for(int i = 0; i <= arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===================");
		
		//for each 
		for(int a : arr) {
			System.out.println(a);
			break;
		}
		System.out.println("---------------");
		//doudle array
		double d[] = new double[3];
		d[0]=10.90;
		d[1]=12.09;
		d[2]=25.3;
		System.out.println(Arrays.toString(d));

		for(double dd : d) {
			System.out.println(dd);
		}
		
		System.out.println("-------------");
		//character array
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = 'e';
		ch[2] = 'i';
		ch[3] = 'o';
		
		//System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		
		for(char c :ch) {
			System.out.println(c);
		}
		
		System.out.println("------------");
		
		//String array 
		String broswer [] = new String[3];//length 3 //HI 2 //Range 0-2
		broswer[0] = "chrome";
		broswer[1] = "firefox";
		broswer[2] = "edge";
		
		System.out.println(Arrays.toString(broswer));
		
		for(String s : broswer) {
			if(s.equals("chrome")) {
			System.out.println(s);
			break; // break the entire for loop not if alone
			}
		}
		System.out.println("------------");
		
		//employee data
		String emp[] = new String[3];
		emp[0]="Shankar";
		emp[1]="Amit";
		emp[2]="Karun";
		
		for(String e : emp) {
			//break the for loop if the employee name is amit
			if(e.equals("Amit")) {
				System.out.println(e);
				break;
			}
		}
		
		System.out.println("-------------");
		//if want to store the all the employee data what array type we need to use
		//can we use only int type -- NO
		//Can we use only String type --No
		//Can we use only char type -- NO
		//then what type of array we need to use to store the employee information
		
		//name - String,age - int ,gender - char, saraly - double, isPer - boolean
		//can we use Object array here
		//yes we use object array
		
		Object data[] = new Object[5]; //0-4
		data[0] = "Atul";
		data[1] = 30;
		data[2] = 'M';
		data[3] = 35.55;
		data[4] = true;
		
		System.out.println(Arrays.toString(data));
		
		//for each loop
		for(Object e : data) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		//index based for loop
		
		for(int i=0;i<=data.length-1;i++) {
			System.out.println(data[i]);
		}
		System.out.println("------------------");
		
		//Print the array in reverser order
		int p[] = new int[4];//0-3
		p[0]=10;
		p[1]=20;
		p[2]=30;
		p[3]=40;
		
		for(int k = p.length-1;k>=0;k--) {
			System.out.println(p[k]);
		}

		//can we print the array from the last index to first index
		//using for each loop
		//another interview question
		System.out.println("------------------");
		
		int count = p.length-1;
		for(int e : p) {
			e = count;
			System.out.println(p[e]);
			count--;
		}
		
		//Array Literal: Static array
		int arn[] = {100,30,10,50,22,44};//6 //0-5
		System.out.println(arn.length);//6
		System.out.println(Arrays.toString(arn));
		System.out.println(arn[0]);
		arn[0]=400;
		System.out.println(arn[0]);
		
		//String array literal
		String testStatus[] = {"Pass","Failed","Skipped"};//length =3 //0-2//HI=2
		//testStatus[3]="NotExecuted";//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		System.out.println(testStatus[3]);
		
	}
}
