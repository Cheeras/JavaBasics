package com.assignments;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 50) {
            bill = units * 1.5;
        } else if (units <= 150) {
            bill = (50 * 1.5) + ((units - 50) * 2.5);
        } else if (units <= 250) {
            bill = (50 * 1.5) + (100 * 2.5) + ((units - 150) * 3.5);
        } else {
            bill = (50 * 1.5) + (100 * 2.5) + (100 * 3.5) + ((units - 250) * 5.0);
        }

        System.out.println("Total Electricity Bill: ₹" + bill);
        sc.close();
    }
}
