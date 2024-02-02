package org.justcupoftea.education.problembook.recur;

public class Recur1 {

    public static void print(int n) {
        System.out.println("Recur1: " + fun(n));
    }

    private static int fun(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 0");
        }
        if (n == 1) {
            return 1;
        }
        return fun(n - 1) * n;
    }
}
