package com.assignments;

public class StudentGrades {

	/*
	 * Classify a student’s grade based on percentage
	 * (e.g., ≥90: A, 80-89: B, etc.)
	 * */
	public static void checkStudentGrade(float percentage) {
		if(percentage >= 90) {
			System.out.println("A Grade ");
		} else if(percentage>= 80 && percentage<=89) {
			System.out.println("B Grade");
		} else if(percentage>=70 && percentage<=79) {
			System.out.println("C Grade");
		} else {
			System.out.println("D Grade");
		}
	}
	
	public static void main(String[] args) {

		checkStudentGrade(90);
		checkStudentGrade(55);
		checkStudentGrade(70);
		checkStudentGrade(65);
	}

}
