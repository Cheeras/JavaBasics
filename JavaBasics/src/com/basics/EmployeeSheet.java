package com.basics;

public class EmployeeSheet {

	
	public int test() {// 0 param
		System.out.println("test  method with 0 parameter");
		return 100;
	}
	
	public double test(int a) {// 1 param of type int
		
		System.out.println("test method with int parameter");
		return 12.5;
	}
	
	// is the above 2 test methods are overloaded 
	// yes because return type does not matter
	
	
	public void test(String a) {// 1 param of type String
		System.out.println("test method with String paramter");
		
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
	
	//Method overloading is compile time polymorphism
	
	//use cases
	//login
	public void login() {}
	public void login(String username,String password) {}
	public void login(String username,String password,int otp) {}
	
	//Search:
	public void search() {}
	public void search(String productName) {}
	public void search(String productName, String color) {}
	public void search(String productName,String color,int price) {}
	
	/*
	 * What are the advantages of method overloading in Java
	 * | Advantage                     | Benefit                         |
	   | ----------------------------- | ------------------------------- |
       | Same name, multiple behaviors | Cleaner and more intuitive code |
       | Flexibility                   | Accepts different input types   |
       | Compile-time polymorphism     | Efficient and safe              |
       | Reduced code duplication      | Better maintainability          |
       | Better API and library design | More user-friendly interfaces   |

	 * */
	//payment
	public void doPayment(String upi) {}
	public void doPayment(String cc,int cvv) {}
	public void doPayment(String cc,int cvv,int otp) {}
	
	//Uber Car booking
	//Car booking
	
	public void carBooking(String stPoint,String endPoint) {}
	
	public void carBooking(String carType,String stPoint,String endPoint) {}
	
	public void carBooking(String carType,String stPoint,String endPoint,int nofPassengers) {}
	
	public static void main(String[] args) {
		EmployeeSheet es = new EmployeeSheet();
		System.out.println(es.test());
	}

}
