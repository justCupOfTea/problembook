package org.justcupoftea.education.problembook.minmax;

import java.util.Scanner;

public class Minmax1 {
    static void fun(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double min = a;
        double max = a;
        n--;
        while (n > 0) {
            a = sc.nextDouble();
            min = Math.min(a, min);
            max = Math.max(a, max);
            n--;
        }
        System.out.printf("min: %s, max: %s%n", min, max);
    }
}
