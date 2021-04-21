package com.pavdem2012.textgame.functions_and_recursion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FunctionsAndRecursion functionsAndRecursion = new FunctionsAndRecursion();
        // Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите
        // функцию min4(a, b, c, d), вычисляющую минимум 4 чисел с помощью функции min.
        // Считайте четыре целых числа и выведите их минимум.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число a: ");
        int a = in.nextInt();
        System.out.print("Введите любое число b: ");
        int b = in.nextInt();
        System.out.println("\nМинимальное из двух чисел a и b - число " + functionsAndRecursion.returnMin2(a , b));
        System.out.print("\nВведите любое число c: ");
        int c = in.nextInt();
        System.out.print("Введите любое число d: ");
        int d = in.nextInt();
        System.out.println("\nМинимальное из четырех чисел a, b, c, d - число " + functionsAndRecursion.returnMin4(a, b, c, d));
        in.close();;
    }

}
