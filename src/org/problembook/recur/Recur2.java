package org.problembook.recur;

public class Recur2 {

    public static void print(int n) {
        System.out.println("Recur2: " + fun(n));
    }

    private static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fun(n - 2) * n;
    }
}
