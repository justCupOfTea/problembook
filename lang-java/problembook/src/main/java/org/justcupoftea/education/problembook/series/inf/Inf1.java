package org.justcupoftea.education.problembook.series.inf;

import java.util.Arrays;

public class Inf1 {

    public static void print() {
        int[] m = new int[]{3, 5, 7, 1};
        System.out.printf("mass=%s, res = %s%n", Arrays.toString(m), fun(m));
        m = new int[]{16, 16, 16, -1};
        System.out.printf("mass=%s, res = %s%n", Arrays.toString(m), fun(m));
    }

    public static int fun(int[] m) {
        int count = 0;
        int max = 0;
        for (int j : m) {
            int a = Math.abs(j);
            int n = 0;
            while (a >= 1) {
                count = count + a & 1;
                a = a >> 1;
                n++;
            }
            int index = n - 1;
            System.out.printf("index=%s, m[i]=%s\n", index, j);
            max = Math.max(max, index);
        }
        count += max;
        return count;
    }
}
