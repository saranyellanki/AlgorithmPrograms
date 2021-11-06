package com.bridgelabz;

import java.util.ArrayList;

/**
 * Prime number class to define all the prime numbers in the given range
 */
public class PrimeNumbers {
    /**
     * static array list is used to add all the prime numbers in the range
     * and stored in an array list "primeNumber"
     */
    static ArrayList<Integer> primeNumber = new ArrayList<>();

    /**
     * Prime number method checks all the prime numbers in the range from 1 to n
     * @param n is an integer which sets the range up to which prime numbers are required
     */
    public static void primeNumber(int n) {
        boolean isPrime = false;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime || i == 2) {
                primeNumber.add(i);
            }
        }
    }

    /**
     * main method implements the static primeNumber method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        primeNumber(1000);
        System.out.println("Prime number in the range from 1 to 1000 is : ");
        System.out.println(primeNumber);
    }
}
