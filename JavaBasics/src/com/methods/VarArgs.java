package com.methods;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun("Shankar",32,434,1212,434,0,88);
	}

	
	static void fun(String s, int ...V) {
		//The variable argument type int of the method fun must be the last parameter
		
		System.out.println(Arrays.toString(V));
	}
	}
