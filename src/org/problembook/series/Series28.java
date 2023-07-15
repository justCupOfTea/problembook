package org.problembook.series;

import java.util.Scanner;

public class Series28 {
    static void fun(int n) {
        Scanner sc = new Scanner(System.in);
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }
        while (n > 0) {
            int x = n;
            double a = sc.nextDouble();
            double res = 1;
            while (x > 0) {
                res *= a;
                x--;
            }
            System.out.println(res);
            n--;
        }
    }
}
