package org.problembook.array;

import java.util.Arrays;

public class Array70 {
    public static void fun(int n, double[] a) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }

        int middle = n / 2;
        for (int i = 0; i < middle; i++) {
            double tmp = a[i];
            a[i] = a[i + middle];
            a[i + middle] = tmp;
        }
        System.out.println("Array70: " + Arrays.toString(a));
    }
}
