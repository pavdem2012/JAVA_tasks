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
        int N = 52;
        System.out.println("\n" + "Целые степени двойки для N = " + N + ": " + cyclesOperators.integerPowersOfTwo(N));

        // Дано натуральное число N. Выведите слово YES, если число N является
        // точной степенью двойки, или слово NO в противном случае.
        System.out.println(
                "\n" + "Является ли N = " + N + " точной степенью для двойки: " + cyclesOperators.exactPowerOfTwo(N));

        // Определите сумму всех элементов последовательности,
        // завершающейся числом 0. Массив {3,2,3,5,0,7,5,4}
        int[] intList = { 3, 2, 3, 5, 0, 7, 5, 4 };
        System.out.println("\n" + "Сумма всех элементов последовательности,завершающейся числом 0 равна: "
                + cyclesOperators.getMaxItemCount(intList) + ";");

        // Последовательность состоит из натуральных чисел и завершается числом 0.
        // Определите, какое количество элементов этой последовательности, равны ее
        // наибольшему элементу. {3,5,1,5,2,3,5,0,7,5,4}
        int[] intList1 = { 3, 5, 1, 5, 2, 3, 5, 0, 7, 5, 4 };
        System.out.println("\n" + "Количество наибольших элементов последовательности, завершающейся нулём равно: "
                + cyclesOperators.numberOfLargestElementsSequence(intList1) + ";");

        // Вывести все элементы массива с четными индексами {3,5,1,5,2,3,5,0,7,5,4}
        System.out.print("\n" + "Элементы массива с четным индексом: "
                + cyclesOperators.allElementsWithEvenIndex(intList1) + "\n");

        // Вывести все четные элементы массива.
        System.out.print("\n" + "Четные элементы массива: " + cyclesOperators.allEvenElements(intList1) + "\n");

        // Найти количество положительных элементов в данном массиве. {1,-2,3,-4,5}
        int[] intList2 = { 1, -2, 3, -4, 5 };
        System.out.println("\n" + "Kоличество положительных элементов в массиве: "
                + cyclesOperators.numberOfPositiveElementsInArray(intList2) + ";");

        // Дан массив чисел. Выведите все элементы массива, которые больше предыдущего
        // элемента . {1,5,2,4,3}
        int[] intList3 = {1,5,2,4,3};
        System.out.print("\n" + "Элементы массива больше предыдущего: " + cyclesOperators.elementsAreLargerPreviousOne(intList3) + "\n");
    }
}
