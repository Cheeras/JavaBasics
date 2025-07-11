package com.assignments;

public class TimeSlotBooking {

    public static void main(String[] args) {
        int hour = 13; // You can take input from user via Scanner or pass dynamically

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid time entered");
        } else if ((hour >= 9 && hour < 12) || (hour >= 14 && hour <= 17)) {
            System.out.println("Booking Available");
        } else if (hour >= 12 && hour < 14) {
            System.out.println("Lunch Break");
        } else {
            System.out.println("Slot Unavailable");
        }
    }
}
