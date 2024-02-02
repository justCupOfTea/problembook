package org.justcupoftea.education.codeforces.practice._104034;

import java.util.Scanner;


/**
 * Любимое занятие Луки — наблюдать за кузнечиками. Сегодня утром, прогуливаясь по парку, он обнаружил кузнечика,
 * который прыгал по окружности длиной n метров.
 * <p>
 * Лука заметил, что за один прыжок кузнечик может переместиться по часовой стрелке на k или k+1 метров от своей текущей
 * позиции на окружности. Мальчику стало интересно, какое минимальное количество прыжков потребуется кузнечику,
 * чтобы, начав прыгать из некоторой точки окружности, снова оказаться в ней.
 * <p>
 * Входные данные
 * Первая строка содержит одно целое число n (1≤n≤106) — длина окружности в метрах.
 * <p>
 * Вторая строка содержит одно целое число k
 * (1≤k≤109) — характеристика длины прыжка кузнечика в метрах.
 * <p>
 * Гарантируется, что 1≤n⋅k≤109.
 * <p>
 * Выходные данные
 * Выведите одно целое число — минимальное количество прыжков, которое придется сделать кузнечику,
 * чтобы, начав прыгать из некоторой точки окружности, снова оказаться в ней.
 *
 * @see <a href="https://codeforces.com/gym/104034/problem/3">Лука наблюдает за кузнечиками</a>
 */
public class Luka3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long l = scanner.nextLong();
            long k = scanner.nextLong();
            long points = fun(l, k);
            System.out.println(points);
        }
    }

    public static long fun(long l, long k) {
        if (!(l >= 1 && l <= 1_000_000)) {
            throw new IllegalArgumentException("Error array length");
        }
        if (!(k >= 1 && k <= 1_000_000_000)) {
            throw new IllegalArgumentException("Error k");
        }

        return fun2(l, k);
    }


    public static long fun2(long l, long k) {
        int i = 1;
        long m = i * k;
        while (!(m % l == 0 || m / l < (m + i) / l)) {
            i++;
            m = i * k;
        }
        return i;
    }

}
