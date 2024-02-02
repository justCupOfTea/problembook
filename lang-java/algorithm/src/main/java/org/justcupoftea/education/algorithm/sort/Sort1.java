package org.justcupoftea.education.algorithm.sort;

import java.util.Scanner;

public class Sort1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int l = scanner.nextInt();
            int k = scanner.nextInt();
            int[] array = new int[l];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int[] a = sortK(array, k);
            for (int i = 0; i < a.length - 1; i++) {
                System.out.println(a[i]);
            }
        }
    }

    public static int[] sortK(int[] array, int k) {

        int[] a = new int[k + 1];
        for (int i = 0; i < array.length; i++) {
            sort(a, array[i], i);
        }
        return a;
    }

    public static void sort(int[] a, int b, int i) {
        for (int j = 0; j < Math.min(a.length, i + 1); j++) {
            if (a[j] < b) {
                int tmp = a[j];
                a[j] = b;
                b = tmp;
            }
        }
    }

}
