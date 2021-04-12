package com.pavdem2012.textgame.cycles_operator;

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
        int[] intList3 = { 1, 5, 2, 4, 3 };
        System.out.print("\n" + "Элементы массива больше предыдущего: "
                + cyclesOperators.elementsAreLargerPreviousOne(intList3) + "\n");

        // Дан массив целых чисел. Если в нем есть два соседних элемента одного знака,
        // выведите эти числа. Если соседних элементов одного знака нет - не выводите
        // ничего. Если таких пар соседей несколько - выведите первую пару.
        // {-1,2,3,-1,-2}
        int[] intList4 = { -1, 2, 3, -1, -2 };
        System.out.print(cyclesOperators.twoAdjacentElements(intList4));

        // Дан массив. Создать новый массив и наполнить его данным массивом, но в
        // обратном порядке. Вывести новый массив на экран.
        System.out.println("\n" + "Массив в обратном порядке: " + cyclesOperators.arrayToNewReverseArray(intList1));

        // Выведите значение наименьшего из всех положительных элементов в массиве.
        // Известно, что в массиве есть хотя бы один положительный элемент.
        // {5,-4,3,-2,1}
        int[] intList5 = { 5, -4, 3, -2, 1 };
        System.out.println(cyclesOperators.smallestOfPositiveElements(intList5));

        // Выведите значение наименьшего нечетного элемента списка, а если в списке нет
        // нечетных элементов - выведите число 0 {0,1,2,3,4} -> 1 {2,4,6,8,10} -> 0
        int[] intList6 = {2, 4, 1};
        System.out.println(
                "Hаименьший нечетный элемент списка: " + cyclesOperators.smallestOddElementList(intList6) + ";");

        // Дан список, упорядоченный по возрастанию элементов в нем. Определите, сколько
        // в нем различных элементов. {1,2,2,3,3,3} -> 3
        int[] intList7 = { 1 };
        System.out.println(
                "\nКоличество различных элементов: " + cyclesOperators.numberOfDifferentElements(intList7) + ";");

        // Переставьте соседние элементы массива (A[0] c A[1], A[2] c A[3] и т.д.). Если
        // элементов нечетное число, то последний элемент остается на своем месте.
        // {1,-2,3,-4,5}, {1,-2,3,-4,5,7}
        int[] intList8 = { 1, -2, 3, -4, 5, };
        String outputText = "";
        for (int i = 0; i < intList8.length; i++) {
            outputText += intList8[i] + "; ";
        }
        System.out.println("\nИзначальный массив: " + outputText + "\nМассив с переставленными парами: "
                + cyclesOperators.rearrangeAdjacentArrayElements(intList8));

        // Циклически сдвиньте элементы списка вправо (A[0] переходит на место A[1],
        // A[1] на место A[2], ..., последний элемент переходит на место A[0]).
        // {1,-2,3,-4,5}
        int[] intList9 = { 1, -2, 3, -4, 5 };
        String otherOutputText = "";
        for (int i = 0; i < intList9.length; i++) {
            otherOutputText += intList9[i] + "; ";
        }
        System.out.println("\nИзначальный массив: " + otherOutputText + "\nСдвинутый  массив: "
                + cyclesOperators.cyclicalRightShift(intList9));

        // Дан массив чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
        // Считается, что любые два элемента, равные друг другу образуют одну пару,
        // которую необходимо посчитать. {1,2,3,2,3} -> 2
        int[] intList10 = { 1, 2, 3, 2, 3 };
        System.out.println("\nКоличество пар элементов равных друг другу: "
                + cyclesOperators.pairsElementsEqualToEachOther(intList10));

        // Дан массив. Выведите те его элементы, которые встречаются в массиве только
        // один раз. Элементы нужно выводить в том порядке, в котором они встречаются в
        // списке. {4,3,5,2,5,1,3,5} -> 4 2 1
        int[] intList11 = { 4, 3, 5, 2, 5, 1, 3, 5 };
        System.out.println("\nЭлементы, встречающиеся в массиве только один раз: "
                + cyclesOperators.uniqueArrayElements(intList11));
    }
}
