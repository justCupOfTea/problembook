package org.justcupoftea.education.problembook.recur;

public class Recur9 {

    public static void print() {
        System.out.printf("Recur9: NOD(%s, %s) = %s%n", 1, 0, fun(1, 0));
        System.out.printf("Recur9: NOD(%s, %s) = %s%n", 0, 1, fun(0, 1));
        System.out.printf("Recur9: NOD(%s, %s) = %s%n", 16, 4, fun(16, 4));
        System.out.printf("Recur9: NOD(%s, %s) = %s%n", 4, 16, fun(4, 6));

    }

    private static int fun(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b == 0) {
            return a;
        } else {
            return fun(b, a % b);
        }
    }
}
