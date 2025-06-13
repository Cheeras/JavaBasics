package com.interviewQuestions;

public class MissingNumberWithXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4}; // Missing number is 3
        int n = 6;

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int xor1 = 0; // XOR of all numbers from 1 to n
        int xor2 = 0; // XOR of all elements in the array

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
            /*
             * XOR Operation
             * 0 ^ 0 = 0
             * 1 ^ 1 = 0
             * 0 ^ 1 = 1
             * 1 ^ 0 = 1
             * 
             * 0 ^ 2 = 2 // zero XOR with any number number it self
             * If we XOR two identical numbers, the result is 0.
             * 5 ^ 5 == 0
             * 5 in decimal = 0101 in binary
             * 5 ^ 5 = 0101 ^ 0101 = 0000
             * So the result is 0
             *
             * xor1 = xor1^i
             * xor1 = 0^1 =1 and i =1/2
             * 0000
             * 0001
             * ======
             * 0001 = 1
             * ======
             * xor1 = 1 ^ 2 and i =2 
             * 0001
             * 0010
             * ====
             * 0011 = 3
             * ====
             * xor1 = 3 ^ 3 and i = 3
             * 0011
             * 0011
             * ====
             * 0000 = 0
             * ====
             * x0r1 = 0 ^ 4 and i = 4
             * 0000
             * 0100
             * ====
             * 0100 = 4
             * ====
             * xor1 = 4 ^ 5 and i = 5
             * 0100
             * 0101
             * ====
             * 0001 = 1
             * =====
             * xor1 = 1 ^ 6
             * 0001
             * 0110
             * =====
             * 0111
             * ====
             * 
             * 
             * */
            System.out.println(xor1);
        }
        System.out.println("=================");
        // XOR all elements in the given array
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
            System.out.println(xor2);
        }

        // The missing number is xor1 ^ xor2
        return xor1 ^ xor2;
    }
}
