package org.problembook.series;

import java.util.Scanner;

public class Series21 {
    boolean fun(int n) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        n = n - 2;
        while (!(a >= b || n == 0)) {
            a = b;
            b = sc.nextDouble();
            n--;
        }
        return !(a >= b);
    }
}
