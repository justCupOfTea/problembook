package org.codeforces;

import java.util.Scanner;

public class LukaArray4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long l = scanner.nextLong();
            long k = scanner.nextLong();
            long points = fun(l, k, scanner);
            System.out.println(points);
        }
    }

    public static long fun(long l, long k, Scanner scanner) {
        if (!(l >= 1 && l <= 50_000)) {
            throw new IllegalArgumentException("Error array length");
        }
        if (!(k >= 1 && k <= 100_000)) {
            throw new IllegalArgumentException("Error k");
        }
        long points = 0;
        for (int i = 0; i < l; i++) {
            long el = scanner.nextLong();
            if (!(el >= 1 && el <= 1000_000_000)) {
                throw new IllegalArgumentException("Error el");
            }
            while (el != 1) {
                long tmp = el / 2;
                long p = el - tmp;
                if (p < k) {
                    points = points + p;
                } else {
                    points = points + k;
                }
                el = tmp;
            }
        }
        return points;
    }

}
