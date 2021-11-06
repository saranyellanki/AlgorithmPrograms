package com.bridgelabz.primeNumAndPalindrome;

public class ReverseOfNumber {
    /**
     * Reverse of a number method reverse the given number
     * @param number integer which should be reversed
     * @return the integer reverse or updated value to the function
     */
    public static int reverseNumber(int number) {
        int update = 0;
        while (number > 0) {
            int remainder = number % 10;
            update = update * 10 + remainder;
            number = number / 10;
        }
        return update;
    }
}
