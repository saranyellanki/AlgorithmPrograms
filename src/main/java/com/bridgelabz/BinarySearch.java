package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Binary Search class for string to check is present or not
 */
public class BinarySearch {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    /**
     * binary search method to check the element present in array list using index values
     * @param arr array list added by user
     * @param search string is the element to be searched
     * @return integer value
     */
    public static int binarySearch(ArrayList<String> arr, String search) {
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int res = search.compareTo(arr.get(middle));
            if (res == 0)
                return middle;
            if (res > 0)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    /**
     * set array list method sets all the words in the array list
     */
    public static void setArrayList() {
        Scanner sc = new Scanner(System.in);
        boolean isOption = false;
        while (!isOption) {
            System.out.println("Enter\n1.To add elements in the file\n2.Exit");
            int num = sc.nextInt();
            if (num == 1) arrayList.add(sc.next());
            else isOption = true;
        }
    }

    public static void main(String[] args) {
        setArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println(arrayList);
        System.out.println("Enter string to search : ");
        String search = sc.nextLine();
        int result = binarySearch(arrayList, search);
        if (result == -1) System.out.println("Element not present");
        else System.out.println("Element found at " + "index " + result);
    }
}
