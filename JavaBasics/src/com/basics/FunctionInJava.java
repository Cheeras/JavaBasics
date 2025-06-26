package com.basics;

public class FunctionInJava {
	//function / method in java
	//it will give reusability of the code
	//no input -- no return
	//input -- return
	//input -- no return
	//no input - return
	
	//functions are independent to each other
	//functions are parallel to each other
	
	//1.no input and no return:
	//void -- no return, function does not return anything(no return keyword)
	public void test() {
		System.out.println("I am from the test method");
	}
	//no input(no of parameter) and no return:
	//zero parameter
	public void calc() {
		System.out.println("Calc method");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	//2.no input(no of parameters) with some return
	//return type of this function is int
	public int getNumber() {
		System.out.println("getNumber");
		int fee=100;
		int tax=20;
		int totalfee = fee+tax;
		return totalfee;
	}
	
	public String getTrinerName() {
		System.out.println("get Triner Name");
		return "naveen";
	}
	public boolean isUserActive() {
		System.out.println("Checking user status");
		return true;
	}
	
	//3.some input and no return
	//int a , int b it is called the parameter
	//when we are referring at method body they are called method parameters
	public void add(int a,int b) {
		System.out.println("adding 2 numbers");
		int sum = a + b;
		System.out.println(sum);
	}
	
	//4.some input and then with return
	//int a , int b are called as parameter
	//when we are referring at method body they are called method parameters
	public int sum(int a,int b) {
		System.out.println("Adding two numbers and returning");
		return a + b;
	}
	public static void main(String[] args) {
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		obj.calc();
		int t = obj.getNumber();
		System.out.println(t);
		String tr = obj.getTrinerName();
		System.out.println(tr);
		boolean flag = obj.isUserActive();
		System.out.println(flag);
		if(flag) {
			System.out.println("login to app");
		}else {
			System.out.println("not able to login to app");
		}
		obj.add(100, 200);// here are 100,200 are called arguments
		//I am calling the add() by passing the arguments
		//when we are referring at the caller we will call as arguments
		int p = obj.sum(20, 30);
		System.out.println(p);
		//here 20,30 are called arguments
		//I am calling the sum by passing the arguments
		//when we are referring at the caller we will call as arguments
		}
}
