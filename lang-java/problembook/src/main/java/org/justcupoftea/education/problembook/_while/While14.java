package org.justcupoftea.education.problembook._while;

public class While14 {
    static void fun(double a) {
        if (a <= 1) {
            throw new IllegalArgumentException("A > 1");
        }
        int k = 1;
        double sum = 0;
        while (sum + 1.0 / k < a) {
            sum += 1.0 / k;
            k++;
        }
        k--;
        System.out.printf("While14: a = %s, sum = %s, k = %s\n", a, sum, k);
    }
}
