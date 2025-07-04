package com.assignments;

public class LeapYearChecker {

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    public static void main(String[] args) {
        checkLeapYear(2024);  // Output: 2024 is a Leap Year.
        checkLeapYear(1900);  // Output: 1900 is NOT a Leap Year.
        checkLeapYear(2000);  // Output: 2000 is a Leap Year.
        checkLeapYear(2023);  // Output: 2023 is NOT a Leap Year.
    }
}
