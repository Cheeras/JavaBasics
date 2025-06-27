package com.ifelse;

public class StudentSheet {

	//WAF: getStudentMarks(String name)
	//return: marks(int)
	//0 - 100
	//student is not found : return -1
	
	public int getStudentMarks(String name) {
		System.out.println("Student name: " + name);
		switch(name.toLowerCase().trim()) {
		case "priya":
			return 90;
		case "ravi":
			return 10;
		case "shika":
			return 100;
		default:
			System.out.println("Please pass the right student name " + name);
			return -1;
		}
		
	}
	public static void main(String[] args) {
		StudentSheet sh = new StudentSheet();
		int m = sh.getStudentMarks("priya");
		System.out.println(m);
		if(m>0) {
			System.out.println("print marksheet");
		}
		
		
	}

}
