package com.bridgelabz;

/**
 * sort array using bubble sort class
 */
public class BubbleSort {
    /**
     * bubble sort method used to sort the elements in the array
     * @param arr is an integer array
     */
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * display the array after sorting
     * @param arr integer array
     */
    public void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bubbleSortObj = new BubbleSort();
        int[] intArray = {4, 5, 5, 1, 2, 11, 9, 21, 76, 87, 64, 9, 0};
        bubbleSortObj.bubbleSort(intArray);
        System.out.println("Sorted array");
        bubbleSortObj.printArray(intArray);
    }
}
