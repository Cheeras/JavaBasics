package com.basics;

public class IfElseConcept {

	
	public static void main(String[] args) {

		//int a=10,b=20;
		
		//if statement
		/*if(a>b) {//if(expression should always resulting to boolean
			//expression should be boolean meaning it should be either false or true
			System.out.println("a is gr than b");
		}else {
			System.out.println("b is gr than a");
		}*/
		
		/*if(true) {// if we hard code the true of flase in the if(expression)
			//then no need of writing the else block
			//no need of writing else block
			System.out.println("Yes");
		}else {//dead code
			System.out.println("No");
		}*/
		
		
		//same above code written in following format
		//this is valid code why because we have declared flag then using 
		//it can be either true of false we don't in run time 
		//
		/*boolean flag = false;
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}*/
		
		/*String broswer="chrome";
		if(broswer.equals("chrome")) {
			System.out.println("Chrome broswer is launched!");
		}
		if(broswer.equals("firefox")) {
			System.out.println("Firefox broswer is launched");
		}
		if(broswer.equals("edge")) {
			System.out.println("Edge broswer is launched");
		}
		if(broswer.equals("ie")) {
			System.out.println("IE broswer is launched");
		}
		else {
			System.out.println("Please provide correct broswer name "+broswer);
		}*/
		
		//better version for above code using the else if
		//Basics very very important
		
		String broswer = "edge";
		
		if(broswer.equals("chrome")) {
			System.out.println("Chrome broswer is launched!");
		}
		else if(broswer.equals("firefox")) {
			System.out.println("Firefox broswer is launched!");
		}
		else if(broswer.equals("edge")) {
			System.out.println("Edge broswer is launched!");
		}
		else if(broswer.equals("ie")) {
			System.out.println("IE broswer is launched");
		}
		else {
			System.out.println("Please provide correct broswer name "+broswer);
		}
		
	}
}
