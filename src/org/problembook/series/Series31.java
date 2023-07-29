package org.problembook.series;

import java.util.Scanner;

public class Series31 {
    static int fun(int n, int k) {
        Scanner sc = new Scanner(System.in);
        if (n < 1 || k < 1) {
            throw new IllegalArgumentException("N, K > 0");
        }

        int sum = 0;
        while (k > 0) {
            int z = n;
            boolean findTwo = false;
            while (z > 0 && !findTwo){
                double a = sc.nextDouble();
                if (a == 2.0) {
                    findTwo = true;
                }
                z --;
            }
            if(findTwo){
                sum++;
            }
            while(z>0){
                double a = sc.nextDouble();
                z --;
            }
           k--;
        }
        return sum;
    }
}
