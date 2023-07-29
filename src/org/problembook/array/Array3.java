package org.problembook.array;

import java.util.Arrays;

public class Array3 {
    public static void fun(int n, double a, double d) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 1");
        }
        double[] res = new double[n];
        int i = 0;
        res[i] = a;
        i++;
        while (i < n) {
            res[i] = res[i - 1] + d;
            i++;
        }
        System.out.println(Arrays.toString(res));
    }
}
