package org.problembook.recur;

public class Recur6 {

    public static void print() {
        System.out.printf("Recur6: fun(%s, %s) = %s \n", 6, 2, fun(6, 2));
        System.out.printf("Recur6: fun(%s, %s) = %s \n", 6, 3, fun(6, 3));
        System.out.printf("Recur6: fun(%s, %s) = %s \n", 6, 4, fun(6, 4));
        System.out.printf("Recur6: fun(%s, %s) = %s \n", 6, 5, fun(6, 5));
        System.out.printf("Recur6: fun(%s, %s) = %s \n", 6, 6, fun(6, 6));
    }

    private static int fun(int n, int k) {
        if (n <= 0) {
            throw new IllegalArgumentException("N натуральное");
        }

        if (!(k >= 0 && k <= n)) {
            throw new IllegalArgumentException("0<=k<=n");
        }
        if (k == 0 || n == k) {
            return 1;
        }

        return fun(n - 1, k) + fun(n - 1, k - 1);
    }
}
