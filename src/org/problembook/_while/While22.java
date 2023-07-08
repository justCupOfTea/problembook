package org.problembook._while;

public class While22 {
    static boolean fun(double a) {
        if (a <= 1) {
            throw new IllegalArgumentException("A > 1");
        }
        int k = 2;
        boolean res = true;
        while (k < a) {
            if (a % k == 0) {
                res = false;
                break;
            }
            k++;
        }

        return res;
    }
}
