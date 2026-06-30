package classandobjects;

import java.util.Arrays;

public class Student {

	String name;
	int age;
	String subjects[];
	public static void main(String[] args) {
		//how to initilize the values into class variables or template variable
		//first create the object of the class
		Student s = new Student();
		s.name = "shankar";
		s.age = 35;
		s.subjects = new String[] {"Java","Selenium","SQL","API Testing"};
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(Arrays.toString(s.subjects));
		
	}

}
