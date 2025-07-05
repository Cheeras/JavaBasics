package com.assignments;

public class PrimeChecker {

    public static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        boolean isPrime = true;

        // Loop from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        checkPrime(2);    // Prime
        checkPrime(15);   // Not Prime
        checkPrime(17);   // Prime
        checkPrime(1);    // Not Prime
        checkPrime(0);    // Not Prime
        checkPrime(-5);   // Not Prime
    }
}
