package com.pavdem2012.tasksToUseCyclesOperator;

public class Main {

    public static void main(String[] args) {
        // Дана переменная n. Вывести факториал n.
        int n = 10;
        CyclesOperators cyclesOperators = new CyclesOperators();
        System.out.println("Факториал числа n = " + n + " = " + cyclesOperators.calculateFactorial(n) + ".");

        // Даны две переменные: x, y. Вычислить x в степени y.
        int x = 3;
        int y = 3;
        System.out.println("\nx^y = " + cyclesOperators.degreeCalculator(x, y) + ".");

        // Вывести массив типа boolean в обратном порядке используя цикл со счётчиком.
        boolean[] array = { true, true, true, false, true, false };
        System.out.println("\nВ обратном порядке: " + cyclesOperators.reverseArray(array));

        // Массив типа char выводить символы пока не встретится пробел.
        String text1 = "Hello Wonderful World!";
        System.out.println("\n" + cyclesOperators.arrayToSpace(text1));

        // Альтернативное решение
        String text2 = "Пытаюсь понять JAVA";
        System.out.println("\n" + cyclesOperators.arrayToSpaceAlternative(text2));

        // По данному числу N вывести все целые степени двойки, не превосходящие N,
        // в порядке возрастания. Например: 1 2 4 8 16 32 для N=52
        int N = 64;
        System.out.println("\n" + "Целые степени двойки для N = " + N + ": " + cyclesOperators.integerPowersOfTwo(N));

        // Дано натуральное число N. Выведите слово YES, если число N является
        // точной степенью двойки, или слово NO в противном случае.
        System.out.println(
                "\n" + "Является ли N = " + N + " точной степенью для двойки: " + cyclesOperators.exactPowerOfTwo(N));

        // Определите сумму всех элементов последовательности,
        // завершающейся числом 0. Массив {3,2,3,5,0,7,5,4}
        int[] intList = { 3, 2, 3, 5, 0, 7, 5, 4 };
        System.out.println("\n" + "Сумма всех элементов последовательности,завершающейся числом 0 равна: "
                + cyclesOperators.sumOfEelementsSequenceToZero(intList) + ";");
    }
}
