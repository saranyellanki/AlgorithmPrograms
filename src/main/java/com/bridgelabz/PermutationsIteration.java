package com.bridgelabz;

public class PermutationsIteration {

    private static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static String join(char[] a) {
        return String.valueOf(a);
    }

    public static void combString(String s) {
        System.out.println(s);
        char[] a = s.toCharArray();
        int n = a.length;
        int[] p = new int[n];
        int i = 1;
        while (i < n) {
            if (p[i] < i) {
                int j = ((i % 2) == 0) ? 0 : p[i];
                swap(a, i, j);
                System.out.println(join(a));
                p[i]++;
                i = 1;
            } else {
                p[i] = 0;
                i++;
            }
        }
    }
}
