package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Insertion sort of string class
 */
public class InsertionSort {

    private static final ArrayList<String> arrayList = new ArrayList<>();

    /**
     * insertion method used to sort the strings in the array
     * @param listOfStrings is the list of strings in array list
     */
    public static void insertion(ArrayList<String> listOfStrings) {
        for (int i = 0; i < listOfStrings.size() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (listOfStrings.get(j).compareTo(listOfStrings.get(j - 1)) < 0) {
                    String temp = listOfStrings.get(j);
                    listOfStrings.set(j, listOfStrings.get(j - 1));
                    listOfStrings.set(j - 1, temp);
                }
            }
        }
    }

    /**
     * setArrayList method sets the array of strings given by the user
     */
    public static void setArrayList() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter\n1.To Add string to array list\n2.To exit");
            int num = sc.nextInt();
            sc.nextLine();
            if(num==1) arrayList.add(sc.nextLine());
            else break;
        }
    }

    public static void main(String[] args) {
        setArrayList();
        System.out.println("List before sorting : ");
        System.out.println(arrayList);
        System.out.println("List after sorting : ");
        insertion(arrayList);
        System.out.println(arrayList);
    }
}
