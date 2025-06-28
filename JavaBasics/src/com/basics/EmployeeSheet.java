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

	public void test(String a, String b) {// 1 param of type String

	}

	public void test(String a, int b) {// 1 param of type String

	}

	public void test(int a, String b) {// 1 param of type String

	}

	// this is called method overloading
	// method overloading is also called as polymorphism
	// poly - many , morphism means forms
	// what is method overloading
	// with in the same class if we have multiple methods
	// 1. with the same method name
	// 2. with different number of parameters
	// 3. with different sequence of parameters{1,2,3 has to be justified}(if the no
	// of parameters are same)
	// 4. return type does not matter here

	// Method overloading is compile time polymorphism

	// use cases
	// login
	public void login() {
	}

	public void login(String username, String password) {
	}

	public void login(String username, String password, int otp) {
	}

	// Search:
	public void search() {
	}

	public void search(String productName) {
	}

	public void search(String productName, String color) {
	}

	public void search(String productName, String color, int price) {
		System.out.println("Searched for " + productName + " with the color " + color + "with price" + price);
	}

	/*
	 * What are the advantages of method overloading in Java | Advantage | Benefit |
	 * | ----------------------------- | ------------------------------- | | Same
	 * name, multiple behaviors | Cleaner and more intuitive code | | Flexibility |
	 * Accepts different input types | | Compile-time polymorphism | Efficient and
	 * safe | | Reduced code duplication | Better maintainability | | Better API and
	 * library design | More user-friendly interfaces |
	 * 
	 */
	// payment
	public void doPayment(String upi) {
	}

	public void doPayment(String cc, int cvv) {
	}

	public void doPayment(int cvv, String cc) {
	}

	public void doPayment(String cc, int cvv, int otp) {
	}

	// Uber Car booking
	// Car booking

	public void carBooking(String stPoint, String endPoint) {
	}

	public void carBooking(String carType, String stPoint, String endPoint) {
	}

	public void carBooking(String carType, String stPoint, String endPoint, int nofPassengers) {
	}

	// Taxcalculation
	public double calculateTax(int totalIncome, int bonus, int stocksProfit) {
		System.out.println("Calculating the tax");
		double totalTax = (totalIncome * 30) / 100 + (bonus * 5) / 100 + (stocksProfit * 2) / 100;
		return totalTax;
	}// we are not using the stocksProfit as part of the calculation

	public double calculateTax(int totalIncome, int bonus) {
		System.out.println("Calculating the tax");
		double totalTax = (totalIncome * 30) / 100 + (bonus * 5) / 100;
		return totalTax;
	}
	
	//void with blank return
	public void click(String element) {
		System.out.println("Clicking on the element : " + element);
		return;
	}
	
	//void with blank return is possible
	//Yes it is possible
	//after return if want to write any thing we can not write 
	
	
//	public void getNumber(int num) {
//		System.out.println("getNumber from int parameter "+num);
//	}
	public void getNumber(byte num) {
		System.out.println("getNumber from byte parameter "+num);
	}
//	public void getNumber(long num) {
//		System.out.println("getNumber from long parameter "+num);
//	}

	public static void main(String[] args) {
		EmployeeSheet es = new EmployeeSheet();
		System.out.println(es.test());

		es.search("Tshirt", "Red", 1000);
		double tax = es.calculateTax(1000000, 200000, 500000);
		System.out.println("Tax amount is " + tax);
		es.getNumber((byte)100);
	}

}
