package org.codeforces;

import java.util.Scanner;

public class Luka3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long l = scanner.nextLong();
            long k = scanner.nextLong();
            long points = fun(l, k);
            System.out.println(points);
        }
    }

    public static long fun(long l, long k) {
        if (!(l >= 1 && l <= 1_000_000)) {
            throw new IllegalArgumentException("Error array length");
        }
        if (!(k >= 1 && k <= 1_000_000_000)) {
            throw new IllegalArgumentException("Error k");
        }

        return fun2(l, k);
    }


    public static long fun2(long l, long k) {
        int i = 1;
        long m = i * k;
        while (!(m % l == 0 || m / l < (m + i) / l)) {
            i++;
            m = i * k;
        }
        return i;
    }

}
