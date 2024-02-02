package org.justcupoftea.education.problembook.recur;

public class Recur3 {

    public static void print(int n, double x) {
        System.out.println("Recur3: " + fun(n, x));
    }

    private static double fun(int n, double x) {
        if (x == 0) {
            throw new IllegalArgumentException("x!=0");
        }
        if (n == 0) {
            return 1;
        } else if (n > 0 && n % 2 == 0) {
            double v = fun(n / 2, x);
            return v * v;
        } else if (n > 0 && n % 2 != 0) {
            return x * fun(n - 1, x);
        } else if (n < 0) {
            return 1 / fun(-n, x);
        } else {
            throw new IllegalStateException("error");
        }

    }
}
