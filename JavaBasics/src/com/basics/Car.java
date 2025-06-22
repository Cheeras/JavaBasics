package com.basics;

public class Car {

	String name;
	int price;
	String modelNumber;
	static int wheels=4;

	public static void main(String[] args) {

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
		//how to access the non static variable: Using the object reference
		System.out.println(c1.name +" "+c1.price+" "+c1.modelNumber);
		System.out.println(c2.name +" "+c2.price+" "+c2.modelNumber);
		System.out.println(c3.name +" "+c3.price+" "+c3.modelNumber);

	}

}
