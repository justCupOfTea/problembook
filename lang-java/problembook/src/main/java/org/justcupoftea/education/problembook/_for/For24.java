package org.justcupoftea.education.problembook._for;

public class For24 {
    static double f(double x, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Число n должно быть натуральным числом");
        }
        int b = 1;
        double v = 1;
        double f = 1;
        double s = 1;
        for (int i = 1; i <= n; i++) {
            b = -b;
            f = f * (2 * i - 1) * 2 * i;
            v = v * x * x;
            s = s + b * v / f;
        }
        return s;
    }
}
