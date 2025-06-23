package com.basics;

public class Car {

	String name;
	int price;
	String modelNumber;
	static final int wheels=4;
	static int keys = 2;
	public static void main(String[] args) {

		//static int p=10;// local variable can not be static
		//Illegal modifier for parameter p; only final is permitted
		final int p = 10;
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.modelNumber = "x3";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 65;
		c2.modelNumber = "q3";
		
		Car c3 = new Car();
		c3.name = "Nexon";
		c3.price = 35;
		c3.modelNumber = "q3";

		Car c4 = new Car();
		c4.name = "Tata Nexon";
		c4.price = 25;
		c4.modelNumber = "ex";
		
		//how to access the static variable
		//1. using the class name
		System.out.println(Car.wheels);
		//2. Using directly
		System.out.println(wheels);
		//3. Can i access static variable using the Object ref name?
		System.out.println(c1.wheels);//Warning: Static field should be accessed
		//in static way
		System.out.println(c2.name);//to access non static variable we should 
		//call using the ref object
//		Car.wheels=5;
//		Car.keys =3;//if some one is trying to change, how we can restrict 
		//using the final keyword 
		//how to access the non static variable: Using the object reference
		
		System.out.println(c1.name +" "+c1.price+" "+c1.modelNumber+" "+Car.wheels);
		System.out.println(c2.name +" "+c2.price+" "+c2.modelNumber+" "+Car.wheels);
		System.out.println(c3.name +" "+c3.price+" "+c3.modelNumber+" "+Car.wheels);

	}

}
