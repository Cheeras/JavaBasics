package com.methods;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun(32,434,1212,434,0,88);
	}

	
	static void fun(int ...V) {
		System.out.println(Arrays.toString(V));
	}
	}
