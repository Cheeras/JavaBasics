package com.basics;

public class Customer {

	/*
	 * Try to under the requirement before writing the function what exactly we need
	 * here create a function: this will return the customer marks on the basis of
	 * given customer name name: getCustomerMarks()
	 * 
	 */
	//how many returns it doing at a time 
	//answer is only one
	//multiple returns
	//single return statement
	public int getCustomerMarks(String name) {
		System.out.println("Customer name is : " + name);
		int marks = -1;
		//with if else with multiple return statments
		if (name.equals("Shankar")) {
			//return 90;
			marks = 90;
		} else if (name.equals("Raju")) {
			//return 80;
			marks = 80;
		} else if (name.equals("Bhanu")) {
			//return 95;
			marks = 95;
		} else if (name.equals("naveen")) {
			//return 10;
			marks = 10;
		} else {
			System.out.println("Please pass the right customer name... " + name);
		}
		return marks;
		
		//using the switch case
		//with multiple returns
//		switch(name.trim().toLowerCase()) {
//		case "shankar":
//			return 90;
//		case "raju":
//			return 80;
//		case "bhanu":
//			return 95;
//		case "naveen":
//			return 10;
//		default:
//		{
//			System.out.println("Please pass the right customer name... " + name);
//			return -1;
//		}
//		}
		
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		int marks = c.getCustomerMarks("pooja");
		System.out.println(marks);
		if(marks>=0) {
			System.out.println("Print the marksheet");
		}
	}

}
