package com.pavdem2012.textgame.functions_and_recursion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        FunctionsAndRecursion functionsAndRecursion = new FunctionsAndRecursion();
        // Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите
        // функцию min4(a, b, c, d), вычисляющую минимум 4 чисел с помощью функции min.
        // Считайте четыре целых числа и выведите их минимум.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число a: ");
        int a = in.nextInt();
        System.out.print("Введите любое целое число b: ");
        int b = in.nextInt();
        System.out.println("\nМинимальное из двух целых чисел a и b - число: " + functionsAndRecursion.getMin(a, b));
        System.out.print("\nВведите любое целое число c: ");
        int c = in.nextInt();
        System.out.print("Введите любое целое число d: ");
        int d = in.nextInt();
        System.out.println(
                "\nМинимальное из четырех целых чисел a, b, c, d - число: " + functionsAndRecursion.getMin(a, b, c, d));

        // Даны четыре действительных числа: x1, y1, x2, y2. Напишите функцию
        // distance(x1, y1, x2, y2), вычисляющую расстояние между точкой (x1. y1) и (x2,
        // y2). Считайте четыре действительных числа и выведите результат работы этой
        // функции.
        System.out.print("\nВведите любое действительное число x1: ");
        double x1 = in.nextDouble();
        System.out.print("Введите любое действительное число y1: ");
        double y1 = in.nextDouble();
        System.out.print("Введите любое действительное число x2: ");
        double x2 = in.nextDouble();
        System.out.print("Введите любое действительное число y2: ");
        double y2 = in.nextDouble();
        System.out.println("\nРасстояние между точкой (x1, y1) и (x2, y2) равно: "
                + functionsAndRecursion.getDistance(x1, x2, y1, y2));

        // "Дано действительное положительное число a и целоe число n. Вычислите a в
        // степени n. Решение оформите в виде рекурсивной функции power(f, n)."
        System.out.print("\nВведите любое действительное положительное число f: ");
        double f = in.nextDouble();
        System.out.print("\nВведите любое целое число n: ");
        int n = in.nextInt();
        System.out.println("\nf в степени n равно: " + functionsAndRecursion.power(f, n));

        // "Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от
        // 1. Решение оформите в виде функции MinDivisor(n). Количество операций в
        // программе должно быть пропорционально корню из n. Указание. Если у числа n
        // нет делителя, меньшего n , то число n — простое и ответом будет само число
        // n."
        System.out.println("\nВведите любое натуральное число e > 1: ");
        int e = in.nextInt();
        System.out.println("\nНаименьший делитель числа е: " + functionsAndRecursion.minDivisor(e));

        // Альтернативное решение.
        System.out.println("\nНаименьший делитель числа е: " + functionsAndRecursion.minDivisor(e, 2));

        // "Дано натуральное число g > 1. Проверьте, является ли оно простым. Программа
        // должна вывести слово YES, если число простое и NO, если число составное.
        // Решение оформите в виде функции IsPrime(g), которая возвращает True для
        // простых чисел и False для составных чисел. Количество операций в программе
        // должно быть пропорционально корню из g."
        System.out.println("\nВведите любое натуральное число g > 1: ");
        int g = in.nextInt();
        boolean isPrime = functionsAndRecursion.isPrime(g, 0);
        if (isPrime) {
            System.out.println("Число g является простым: YES");
        } else {
            System.out.println("Число g является простым: NO");
        }

        // Альтернативное решение.
        System.out.println("\nЧисло g является простым: " + functionsAndRecursion.isPrime(g));

        // Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех
        // этих чисел, не используя цикл.
        System.out.println("\nВводите целые числа (завершение последовательности 0): ");
        functionsAndRecursion.recursionSum(0);
        in.close();
    }
}
