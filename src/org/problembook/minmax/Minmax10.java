package org.problembook.minmax;

import java.util.Scanner;

public class Minmax10 {
    static void fun(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int ai = i;
        double a = sc.nextDouble();
        double prev = a;
        n--;
        while (n > 0 && a == prev) {
            i++;
            prev = a;
            a = sc.nextDouble();
            if (a != prev) {
                ai = i;
            }
            n--;
        }
        System.out.printf("index: %s\n", ai);
    }
}
