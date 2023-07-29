package org.problembook.array;

import java.util.Arrays;

public class Array65 {
    public static void fun(int n, double[] a, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 1");
        }
        if (!(k >= 1 && k <= n)) {
            throw new IllegalArgumentException("(1 ≤ K ≤ N)");
        }

        double ak = a[k - 1];//todo (1 ≤ K ≤ N) ?
        for (int i = 0; i < n; i++) {
            a[i] = a[i] + ak;
        }

        System.out.println("Array65: " + Arrays.toString(a));
    }
}
