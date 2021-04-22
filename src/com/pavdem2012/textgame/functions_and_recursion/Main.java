package com.pavdem2012.textgame.functions_and_recursion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FunctionsAndRecursion functionsAndRecursion = new FunctionsAndRecursion();
        // Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите
        // функцию min4(a, b, c, d), вычисляющую минимум 4 чисел с помощью функции min.
        // Считайте четыре целых числа и выведите их минимум.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число a: ");
        int a = in.nextInt();
        System.out.print("Введите любое целое число b: ");
        int b = in.nextInt();
        System.out.println("\nМинимальное из двух целых чисел a и b - число - " + functionsAndRecursion.getMin(a, b));
        System.out.print("\nВведите любое целое число c: ");
        int c = in.nextInt();
        System.out.print("Введите любое целое число d: ");
        int d = in.nextInt();
        System.out.println("\nМинимальное из четырех целых чисел a, b, c, d - число - "
                + functionsAndRecursion.getMin(a, b, c, d));

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
        System.out.println(
                "\nРасстояние между точкой (x1, y1) и (x2, y2) - " + functionsAndRecursion.getDistance(x1, x2, y1, y2));
        in.close();
    }
}
