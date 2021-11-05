package com.bridgelabz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Permutations of a string is included in the class
 */
public class Permutations {
    static Set<String> list = new HashSet<>();

    /**
     * permutations method is a recursive function
     * @param current string is updated with character to be fixed everytime
     * @param updated string is the updated string when reaches empty recursive function is returned
     */
    private static void permutations(String current, String updated) {
        if (updated == null) {
            return;
        }
        if (updated.length() == 0) {
            list.add(current);
        }
        for (int i = 0; i < updated.length(); i++) {
            String newCurrent = current + updated.charAt(i);
            String newUpdated = updated.substring(0, i) + updated.substring(i + 1);
            permutations(newCurrent, newUpdated);
        }
    }

    /**
     * main method to implement the permutations of the given string
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check all permutations : ");
        String str = sc.nextLine();
        permutations("", str);
        System.out.println(list);
    }
}
