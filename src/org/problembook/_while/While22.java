package org.problembook._while;

public class While22 {
    static boolean fun(double a) {
        if (a <= 1) {
            throw new IllegalArgumentException("A > 1");
        }
        int k = 2;
        while (!(k == a || a % k == 0)) {
            k++;
        }

        return k==a;
    }
}
