package com.bridgelabz;

import java.util.ArrayList;

import static com.bridgelabz.PrimeNumbers.primeNumber;
import static com.bridgelabz.ReverseOfNumber.reverseNumber;

/**
 * Palindrome prime number class which imported Prime number class
 * and Reverse of number class to check if the prime number is palindrome or not
 */
public class PalindromePrime {
    /**
     * palindrome prime is an array list in which all the palindrome prime numbers
     * are added in the list
     */
    static ArrayList<Integer> palindromePrime = new ArrayList<>();

    /**
     * palindrome method checks the reverse of number method and if it is true
     * the element is added to the palindrome prime list
     */
    public static void palindrome() {
        for (int i : primeNumber) {
            if (i > 10) {
                if (i == reverseNumber(i)) {
                    palindromePrime.add(i);
                }
            }
        }
    }

    /**
     * Main method is used to call all the functions
     * Range is predefined and can be changed accordingly in prime number method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        primeNumber(1000);
        System.out.println("All the prime numbers in the range from 1 to 1000 : ");
        System.out.println(primeNumber);
        palindrome();
        System.out.println("All the Palindrome prime numbers in the range 1 to 1000 : ");
        System.out.println(palindromePrime);
    }
}
