package org.problembook.array;

import java.util.Arrays;

public class Array70 {
    public static void fun(int n, double[] a) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }
        int shift = n / 2;
        for (int j = 0; j < shift; j++) {
            double tmp = a[n - 1];
            for (int i = 0; i < n; i++) {
                int prev = (n - (i - 1)) % n;
                tmp = a[i];
                a[i] = a[prev];
            }
        }


        System.out.println("Array68: " + Arrays.toString(a));
    }
}
