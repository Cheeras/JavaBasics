package com.basics;

public class Employee {

	String name;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	public static void main(String[] args) {

		Employee obj = new Employee();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isPerm);
		System.out.println(obj.gender);
		
		System.out.println("---------------");
		
		obj.name ="Pooja";
		obj.age = 30;
		obj.salary =90;
		obj.isPerm = false;
		obj.gender = 'F';
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isPerm);
		System.out.println(obj.gender);
		
		
		
	}

}
