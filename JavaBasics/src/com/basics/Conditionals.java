package com.basics;

public class Conditionals {

	public static void main(String[] args) {

		/*
		 * Syntax of if statement
		 * if(boolean expression True or false){
		 * 	
		 * 	//if body
		 * }else {
		 *	else body
		 * }
		 * 
		 * */
		
		int salary= 9999;
//		if(salary > 10000) {
//			salary = salary +2000;
//		}else {
//			salary = salary + 1000;
//		}
//		
//		System.out.println(salary);
		
		//multiple if else
		if(salary > 10000) {
			salary +=2000;
		}else if(salary>20000) {
			salary +=3000;
		}else {
			salary += 1000;
		}
	}

}
