package org.problembook._while;

public class While10 {
    static int fun(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N > 1");
        }
        int k = 0;
        while (n > 3) {
            n -= 3;
            k++;
        }
        return k;
    }
}
