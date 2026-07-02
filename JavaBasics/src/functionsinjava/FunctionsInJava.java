package functionsinjava;

public class FunctionsInJava {
	/*
	 * function or method
	 * what is the use of the function or method why we need to create it
	 * Answer is function/method gives reusability we don't need to write same code again and again
	 * 
	 * Type of functions
	 * =================
	 * no input --> no return
	 * no input --> return
	 * input --> no return
	 * input --> return
	 * 
	 * functions are independent to each other
	 * functions are parallel to each other
	 * Can not create function inside another function
	 * We can call one function inside another function
	 * 
	 * class data members
	 * ==================
	 *  1.class variables --> static and non static
	 *  2.class methods --> static and non static
	 * 
	 * */
	
	//function types
	//1.no input --> no return 
	//void --> no return, function does not return anything (no return keyword)
	public void test() {
		System.out.println("this is test method");
	}
	//no input --> no return
	public void calc() {
		System.out.println("this is calc method");
		int a = 10;
		int b = 20;//function variables are always local variable
		int c = a+b;
		System.out.println(c);
	}
	
	//2.no input --> return
	//function name is camel case
	//return type - integer
	
	public int getNumber() {
		int fee = 100;//function variables are always local variable
		int tax = 20;
		int totalfee = fee+tax;
		return totalfee;
	}
	
	public String getTrainerName() {//one function one return type 
		//we can not return multiple returns from one function
		System.out.println("get Trainer Name");
		return "Naveen";
	}
	
	public boolean isUserActive() {
		System.out.println("Checking user status");
		return true;
	}
	
	//3. input --> no return
	public void add(int a, int b) {
		System.out.println("sum of 2 numbers");
		int sum = a + b;
		System.out.println(sum);
	}
	
	//4. input --> return
	public int sum(int a, int b , int c) {
		System.out.println("adding three int numbers");
		int sum = a + b + c;
		return sum;
	}
	
	//main() method is staring point of a program
	public static void main(String[] args) {
		
		//create the object
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.calc();
		
		int totFee = obj.getNumber();
		System.out.println("Total fee is "+totFee);
		String trainName = obj.getTrainerName();
		
		System.out.println(trainName);
		
		boolean flag = obj.isUserActive();
		System.out.println(flag);
		if(flag) {
			System.out.println("login to app");
		}else {
			System.out.println("login to app failed");
		}
		obj.add(10, 20);//pass by value 
		//any use case in selenium 
		//click method is best example
		
		int sum = obj.sum(20, 30, 50);
		System.out.println(sum);
		
	}

}
