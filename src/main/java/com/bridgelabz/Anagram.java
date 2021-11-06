package com.bridgelabz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Anagram class to detect the given string
 */
public class Anagram{
    /**
     * This method checks the two strings and converts string to char array
     * replaceAll method replaces spaces with empty string
     * strings are converted to characters and stored in array
     * @param sc system input from user
     */
    private static void isAnagram(Scanner sc){
        System.out.print("Enter first string : ");
        String s1 = sc.nextLine();
        String str1 = s1.replaceAll("\\s","");
        System.out.print("Enter second string : ");
        String s2 = sc.nextLine();
        String str2 = s2.replaceAll("\\s","");
        boolean result;
        if(str1.length()!=str2.length()){
            result = false;
        }
        else {
            char[] s1Array = str1.toLowerCase(Locale.ROOT).toCharArray();
            char[] s2Array = str2.toLowerCase(Locale.ROOT).toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            result = Arrays.equals(s1Array,s2Array);
        }
        if(result) System.out.println(str1+" and "+str2+" are anagrams");
        else System.out.println(str1+" and "+str2+" are not anagrams");
    }

    /**
     * Main method implements isAnagram method to check
     * @param args command line argument
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isAnagram(sc);
    }
}
