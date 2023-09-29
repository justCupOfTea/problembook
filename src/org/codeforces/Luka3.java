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

        return fun2(l, k, 1);
    }


    public static long fun2(long l, long k, long n) {
//        if (n == 15) {
//            throw new RuntimeException("");
//        }
        for (int i = 0; i <= n; i++) {
            long m = k * n + i;
//            System.out.println("m: " + m);
//            System.out.println("n: " + n);
//            System.out.println("m / l = " + m / l);
//            System.out.println("m % l = " + m % l);
            if (m / l >= 1 && m % l == 0) {
                return n;
            }

        }
        return fun2(l, k, n + 1);
    }

}
