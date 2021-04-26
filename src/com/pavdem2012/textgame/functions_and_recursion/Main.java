package com.pavdem2012.textgame.functions_and_recursion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        FunctionsAndRecursion functionsAndRecursion = new FunctionsAndRecursion();
        // Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите
        // функцию min4(a, b, c, d), вычисляющую минимум 4 чисел с помощью функции min.
        // Считайте четыре целых числа и выведите их минимум.
        Scanner in = new Scanner(System.in);
        System.out.print("Вычисление минимума двух чисел:\n" + "\nВведите любое целое число a: ");
        int a = in.nextInt();
        System.out.print("Введите любое целое число b: ");
        int b = in.nextInt();
        System.out.println("\nМинимальное из двух целых чисел a и b - число: " + functionsAndRecursion.getMin(a, b));
        System.out.print("\nВычисление минимума четырех чисел:\n" + "\nВведите любое целое число c: ");
        int c = in.nextInt();
        System.out.print("Введите любое целое число d: ");
        int d = in.nextInt();
        System.out.println(
                "\nМинимальное из четырех целых чисел a, b, c, d - число: " + functionsAndRecursion.getMin(a, b, c, d));

        // Даны четыре действительных числа: x1, y1, x2, y2. Напишите функцию
        // distance(x1, y1, x2, y2), вычисляющую расстояние между точкой (x1. y1) и (x2,
        // y2). Считайте четыре действительных числа и выведите результат работы этой
        // функции.
        System.out.print("\nВычисление расстояния между точкой (x1. y1) и (x2, y2)\n"
                + "\nВведите любое действительное число x1: ");
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
        // степени n. Решение оформите в виде рекурсивной функции power(a, n)."
        System.out.print("\nВывод a в степени n:\n" + "\nВведите любое действительное положительное число a: ");
        double f = in.nextDouble();
        System.out.print("\nВведите любое целое число n: ");
        int n = in.nextInt();
        System.out.println("\na в степени n равно: " + functionsAndRecursion.power(f, n));

        // "Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от
        // 1. Решение оформите в виде функции MinDivisor(n). Количество операций в
        // программе должно быть пропорционально корню из n. Указание. Если у числа n
        // нет делителя, меньшего n , то число n — простое и ответом будет само число
        // n."
        System.out.println("\nВывод наименьшего делителя числа n > 1 отличного от 1:\n"
                + "\nВведите любое натуральное число n > 1: ");
        int e = in.nextInt();
        System.out.println("\nНаименьший делитель числа n: " + functionsAndRecursion.minDivisor(e));

        // Альтернативное решение.
        System.out.println("\nНаименьший делитель числа n: " + functionsAndRecursion.minDivisor(e, 2));

        // "Дано натуральное число g > 1. Проверьте, является ли оно простым. Программа
        // должна вывести слово YES, если число простое и NO, если число составное.
        // Решение оформите в виде функции IsPrime(g), которая возвращает True для
        // простых чисел и False для составных чисел. Количество операций в программе
        // должно быть пропорционально корню из g."
        System.out.println("\nПроверка является ли число простым:\n" + "\nВведите любое натуральное число g > 1: ");
        int g = in.nextInt();
        boolean isPrime = functionsAndRecursion.isPrime(g, 2);
        if (isPrime) {
            System.out.println("Число g является простым: YES");
        } else {
            System.out.println("Число g является простым: NO");
        }

        // Альтернативное решение.
        isPrime = functionsAndRecursion.isPrime1(g, 2);
        if (isPrime) {
            System.out.println("\nЧисло g является простым: YES");
        } else {
            System.out.println("\nЧисло g является простым: NO");
        }

        // Еще одно альтернативное решение.
        System.out.println("\nЧисло g является простым: " + functionsAndRecursion.isPrime(g));

        // "Напишите функцию fib(n), которая по данному целому положительному n
        // возвращает n-e число Фибоначчи. В этой задаче нельзя использовать циклы -
        // используйте рекурсию. Первое и второе числа Фибоначчи равны 1, а каждое
        // следующее равно сумме двух предыдущих."
        System.out.println("\nВывод n - ного числа Фибоначчи:" + "\nВведите любое целое положительное число n: ");
        int h = in.nextInt();
        System.out.println("Число Фибоначчи равно: " + functionsAndRecursion.fib(h));

        // Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех
        // этих чисел, не используя цикл.
        System.out.println("\nВывод суммы последовательности завершающейся 0:\n"
                + "\nВводите целые числа (завершение последовательности 0): ");
        functionsAndRecursion.recursionSum(0);

        // Дано натуральное число n. Выведите все числа от 1 до n.
        System.out.println("\nВывод всех чисел от 1 до n:\n" + "Bведите любое число n:");
        int i = in.nextInt();
        System.out.println("\nЧисла от 1 до N: " + functionsAndRecursion.recursiveOutputNumbers(i));

        // Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от
        // A до B включительно, в порядке возрастания, если A < B, или в порядке
        // убывания в противном случае.
        System.out.println("\nВывод всех чисел от A до B включительно:" + "\nBведите любое число A:");
        int a1 = in.nextInt();
        System.out.println("\nBведите любое число B:");
        int b1 = in.nextInt();
        System.out.println("\nПолученная последовательность: " + functionsAndRecursion.outputNumbers(a1, b1));

        // "Дано натуральное число N. Выведите слово YES, если число N является точной
        // степенью двойки, или слово NO в противном случае. Операцией возведения в
        // степень пользоваться нельзя!"
        System.out.println("\nПроверка на точную степень двойки:" + "\nВведите любое натуральное число N: ");
        double c1 = in.nextInt();
        int exactPowerOfTwo = functionsAndRecursion.exactPowerOfTwo(c1);
        if (exactPowerOfTwo == 1) {
            System.out.println("Является ли число - (" + c1 + "), целой степенью двойки: \"YES\"");
        } else {
            System.out.println("Является ли число - (" + c1 + "), целой степенью двойки: \"NO\"");
        }

        // Дана последовательность натуральных чисел (одно число в строке),
        // завершающаяся числом 0. Выведите все нечетные положительные числа из этой
        // последовательности, сохраняя их порядок.
        System.out.println("\nВывод нечетных положительных чисел последовательности,с сохранением их порядка:"
                + "\nВведите последовательность чисел:");
        System.out.println("Все нечетные положительные числа из этой последовательности: "
                + functionsAndRecursion.getOddSequenceNumbers());
        in.close();
    }
}
