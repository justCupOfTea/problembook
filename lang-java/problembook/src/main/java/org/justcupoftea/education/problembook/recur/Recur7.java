package org.justcupoftea.education.problembook.recur;

import java.util.HashMap;
import java.util.Map;

public class Recur7 {
    private static final Map<Pair, Long> map = new HashMap<>();

    public static void print() {

        System.out.printf("Recur7: fun(%s, %s) = %s \n", 6, 2, fun(6, 2));
        System.out.printf("Recur7: fun(%s, %s) = %s \n", 6, 3, fun(6, 3));
        System.out.printf("Recur7: fun(%s, %s) = %s \n", 6, 4, fun(6, 4));
        System.out.printf("Recur7: fun(%s, %s) = %s \n", 6, 5, fun(6, 5));
        long l = System.currentTimeMillis();
        System.out.printf("Recur7: fun(%s, %s) = %s \n", 100, 6, fun(100, 6));
        long time = (System.currentTimeMillis() - l) ;
        System.out.println(map.size());
        System.out.println("time : " + time);
    }

    private static long fun(int n, int k) {
        if (n <= 0) {
            throw new IllegalArgumentException("N натуральное");
        }

        if (!(k >= 0 && k <= n)) {
            throw new IllegalArgumentException("0<=k<=n");
        }
        if (k == 0 || n == k) {
            return 1;
        }
        Pair key = new Pair(n, k);
        Long i = map.get(key);
        if (i == null) {
            i = fun(n - 1, k) + fun(n - 1, k - 1);
            map.put(key, i);
        }

        return i;
    }


    private record Pair(int n, int k) {
    }
}
