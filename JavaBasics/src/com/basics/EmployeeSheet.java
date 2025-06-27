package com.basics;

public class EmployeeSheet {

	
	public int test() {// 0 param
		return 100;
	}
	
	public double test(int a) {// 1 param of type int
		return 12.5;
	}
	
	// is the above 2 test methods are overloaded 
	// yes because return type does not matter
	
	
	public void test(String a) {// 1 param of type String
		
	}
	public void test(String a,String b) {// 1 param of type String
		
	}
	public void test(String a,int b) {// 1 param of type String
	
	}
	public void test(int a,String b) {// 1 param of type String
		
	}
	
	//this is called method overloading
	//method overloading is also called as polymorphism
	//poly - many , morphism means forms
	//what is method overloading 
	//with in the same class if we have multiple methods
	//1. with the same method name
	//2. with different number of parameters
	//3. with different sequence of parameters{1,2,3 has to be justified}
	//4. return type does not matter here
	
	public static void main(String[] args) {
		EmployeeSheet es = new EmployeeSheet();
		System.out.println(es.test());
		

	}

}
