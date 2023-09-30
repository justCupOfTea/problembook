package org.codeforces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LukaDino5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long n = scanner.nextLong();
            fun(n, scanner);
        }
    }

    public static void fun(long n, Scanner scanner) {
        if (!(n >= 1 && n <= 1_0000)) {
            throw new IllegalArgumentException("Error n");
        }
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            if (!(x >= -1_000_000_000 && x <= 1_000_000_000)) {
                throw new IllegalArgumentException("Error x");
            }
            if (!(y >= -1_000_000_000 && y <= 1_000_000_000)) {
                throw new IllegalArgumentException("Error y");
            }
            list.add(new Point(i + 1, x, y));

        }
        list = list.stream().sorted(Comparator.comparing(Point::getX).thenComparing(Point::getY)).toList();
        System.out.println(list.size() - 1);
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i - 1).getNumber() + " " + list.get(i).getNumber());
        }
    }

    private static class Point {
        private final int number;
        private final long x;
        private final long y;

        public Point(int number, long x, long y) {
            this.number = number;
            this.x = x;
            this.y = y;
        }

        public long getX() {
            return x;
        }

        public long getY() {
            return y;
        }

        public int getNumber() {
            return number;
        }
    }

}

