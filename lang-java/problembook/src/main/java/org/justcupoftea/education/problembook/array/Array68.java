package org.justcupoftea.education.problembook.array;

import java.util.Arrays;

public class Array68 {
    public static void fun(int n, double[] a) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                iMax = i;
                max = a[i];
            }
            if (a[i] < min) {
                iMin = i;
                min = a[i];
            }
        }
        a[iMax] = min;
        a[iMin] = max;

        System.out.println("Array68: " + Arrays.toString(a));
    }
}
