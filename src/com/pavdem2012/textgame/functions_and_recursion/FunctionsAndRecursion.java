package com.pavdem2012.textgame.functions_and_recursion;

import java.util.Scanner;

public class FunctionsAndRecursion {

    /**
     * 
     * @param a any entered number.
     * @param b any entered number.
     * @return minimum of any two entered numbers.
     */
    public int getMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    /**
     * 
     * @param a any entered integer.
     * @param b any entered integer.
     * @param c any entered integer.
     * @param d any entered integer.
     * @return minimum of any four entered numbers.
     */
    public int getMin(int a, int b, int c, int d) {
        return getMin(getMin(a, b), getMin(c, d));
    }

    /**
     * 
     * @param x1 any valid number entered.
     * @param x2 any valid number entered.
     * @param y1 any valid number entered.
     * @param y2 any valid number entered.
     * @return distance between point (x1. y1) and (x2, y2).
     */
    public double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * "Дано действительное положительное число f и целоe число n. Вычислите f в
     * степени n. Решение оформите в виде рекурсивной функции power(f, n)."
     * 
     * @param f any valid number entered.
     * @param n any entered integer.
     * @return f to power n.
     * @throws Exception critical exponentiation error.
     */
    public double power(double f, int n) throws Exception {
        if (f == 0 & n == 0) {
            throw new Exception("Ноль в нулевой степени неопределён и лишён смысла!!!");
        }
        if (n < 0) {
            throw new Exception("Cтепень должна быть >= 0!!!");
        }
        if (n == 0) {
            return 1;
        }
        return f * power(f, n - 1);
    }

    /**
     * "Дано натуральное число e > 1. Выведите его наименьший делитель, отличный от
     * 1. Решение оформите в виде функции MinDivisor(e). Количество операций в
     * программе должно быть пропорционально корню из e. Указание. Если у числа e
     * нет делителя, меньшего e , то число e — простое и ответом будет само число
     * e."
     * 
     * @param e any natural number >1.
     * @return least divisor of a natural number e.
     */
    public int minDivisor(int e) {
        if (e % 2 == 0)
            return 2;
        for (int i = 3; i * i <= e; i += 2) {
            if (e % i == 0)
                return i;
        }
        return e;
    }

    /**
     * Решение через рекурсивную функцию: "Дано натуральное число e > 1. Выведите
     * его наименьший делитель, отличный от 1. Решение оформите в виде функции
     * MinDivisor(e). Количество операций в программе должно быть пропорционально
     * корню из e. Указание. Если у числа e нет делителя, меньшего e , то число e —
     * простое и ответом будет само число e."
     * 
     * @param e any natural number >1.
     * @param d is optional and has a default value of 2.
     * @return least divisor of a natural number e.
     */
    public int minDivisor(int e, int d) {
        if (e % d == 0)
            return d;
        return minDivisor(e, ++d);
    }

    /**
     * "Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа
     * должна вывести слово YES, если число простое и NO, если число составное.
     * Решение оформите в виде функции IsPrime(n), которая возвращает True для
     * простых чисел и False для составных чисел. Количество операций в программе
     * должно быть пропорционально корню из n."
     * 
     * @param g any natural number >1.
     * @param i is optional and has a default value
     * @return true or false.
     */
    public boolean isPrime(int g, int i) {
        if (g == 2) {
            return true;
        }
        for (i = 2; i < g; i++) {
            if (g % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Альтернативное решение(Забавная математическая шутка и код намного короче):
     * "Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа
     * должна вывести слово YES, если число простое и NO, если число составное.
     * Решение оформите в виде функции IsPrime(n), которая возвращает True для
     * простых чисел и False для составных чисел. Количество операций в программе
     * должно быть пропорционально корню из n."
     * 
     * @param g any natural number >1.
     * @return "YES" or "NO"
     */
    public String isPrime(int g) {
        if (g == 2 | g == 3) {
            return "YES";
        }
        if ((g * g) % 24 == 1) {
            return "YES";
        }
        return "NO";
    }

    /**
     * Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех
     * этих чисел, не используя цикл.
     * 
     * @param sum sum of numbers.
     */
    public void recursionSum(int sum) {
        Scanner in = new Scanner(System.in);;
        int n = in.nextInt();
        if (n > 0) {
            recursionSum(sum + n);
        } else if (sum > 0 ) {
            System.out.println("\nСумма последовательности равна: " + (int) sum + ";");
        }
        in.close();
    }
}
