package org.justcupoftea.education.codeforces.practice._104034;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Лука смог приобрести всю коллекцию динозавров из «Шестерочки» и обнаружил, что в динозаврах есть коммутаторы,
 * поэтому ему захотелось их объединить в одну локальную сеть.
 * <p>
 * Он расставил на декартовой плоскости всю коллекцию, то есть местоположение каждого динозавра задано двумя
 * числами — координатами по оси xи y.
 * <p>
 * Лука хочет соединить их проводами так, чтобы между любыми двумя динозаврами существовал путь по этим проводам.
 * Луку раздражают спутанные провода, поэтому никакие два провода не должны пересекаться (пересечения в концах отрезков разрешены). Кроме того, у Луки мало денег на покупку проводов, поэтому общее количество проведенных отрезков не должно превышать 2n.
 * <p>
 * Входные данные
 * Первая строка содержит одно целое число n (1≤n≤10^3) — количество динозавров.
 * <p>
 * В следующих 2n
 * строках заданы координаты динозавров. В каждой строке записано одно целое число: первая строка содержит координату по оси x
 * для первого динозавра, вторая строка — координату по оси y
 * для первого динозавра, третья строка — координату по оси x
 * для второго динозавра, и так далее. Таким образом координата xi для i-го динозавра находится (2i)-й строке входных данных,
 * координата yi для i -го динозавра находится в (2i+1) -й строке входных данных. Гарантируется, что (−10^9≤xi,yi≤10^9),
 * а также никакие два динозавра не находятся в одной точке плоскости.
 * <p>
 * Выходные данные
 * В первой строке выведите одно число m — количество проведенных проводов, либо число −1, если соединить динозавров
 * описанным в условии способом невозможно.
 * <p>
 * Если существует подходящее под условие соединение, то в следующих m строках выведите по два целых числа — порядковые
 * номера динозавров, соединенных очередным проводом.
 * <p>
 * Если решений несколько, можно вывести любое из них.
 * <p>
 * Система оценки
 * Решения, правильно работающие только для случаев, когда n не превосходит 4, будут оцениваться в 25
 * баллов.
 * <p>
 * Решения, правильно работающие только для случаев, когда никакие три динозавра не лежат на одной прямой,
 * будут оцениваться в 25 баллов.
 * <p>
 * Решения, правильно работающие только для случаев, когда у всех динозавров координаты по оси x различны,
 * будут оцениваться в 25 баллов.
 * <p>
 * * @see <a href="https://codeforces.com/gym/104034/problem/5">Лука и локальная сеть динозавров</a>
 */
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

