package org.problembook.series;

import java.util.Scanner;

public class Series23 {
    static int fun(int n) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        n = n - 3;
        int i = 2;
        while (!(n == 0 || isNotTooth(a, b, c))) {
            a = b;
            b = c;
            c = sc.nextDouble();
            n--;
            i++;
        }

        return isNotTooth(a, b, c) ? i : 0;
    }

    private static boolean isNotTooth(double a, double b, double c) {
        return !((a < b && b > c) || (a > b && b < c));
    }
}
