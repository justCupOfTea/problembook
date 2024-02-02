package org.justcupoftea.education.problembook._while;

public class While1 {
    static double fun(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("A,B > 0");
        }
        if (a < b) {
            throw new IllegalArgumentException("A<B");
        }

        while (a >= b) {
            a -= b;
        }
        return a;
    }
}
