package org.justcupoftea.education.problembook.recur;

public class Recur4 {
    private static int count = 0;

    public static void print() {
        System.out.println("Recur4: n=1 - " + fun(1) + ", count = " + count);
        count = 0;
        System.out.println("Recur4: n=2 - " + fun(2) + ", count = " + count);
        count = 0;
        System.out.println("Recur4: n=3 - " + fun(3) + ", count = " + count);
        count = 0;
        System.out.println("Recur4: n=4 - " + fun(4) + ", count = " + count);
        count = 0;
        System.out.println("Recur4: n=5 - " + fun(5) + ", count = " + count);
    }

    private static double fun(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n>0");
        }
        count++;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fun(n - 2) + fun(n - 1);
        }
    }

}
