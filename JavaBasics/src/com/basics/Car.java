package com.basics;

public class Car {

	String name;
	int price;
	String modelNumber;
	int wheels;

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.modelNumber = "x3";
		c1.wheels = 4;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 65;
		c2.modelNumber = "q3";
		c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Audi";
		c3.price = 65;
		c3.modelNumber = "q3";
		c3.wheels = 4;

		Car c4 = new Car();
		c4.name = "Tata Nexon";
		c4.price = 25;
		c4.modelNumber = "ex";
		c4.wheels = 4;
		

	}

}
