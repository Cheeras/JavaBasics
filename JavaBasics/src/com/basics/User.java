package com.basics;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Shankar";
		u1.age = 35;
		u1.city = "Vinukonda";

		User u2 = new User();
		u2.name = "Piyush";
		u2.age = 25;
		u2.city = "Pune";

		User u3 = new User();
		u3.name = "Shalini";
		u3.age = 27;
		u3.city = "Bangalore";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		System.out.println("------------------");

		u1 = u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		System.out.println("------------------");

		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

	}

}
