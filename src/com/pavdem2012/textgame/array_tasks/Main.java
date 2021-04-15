package com.pavdem2012.textgame.array_tasks;

public class Main {

    public static void main(String[] args) {
        ArrayTasks arrayTasks = new ArrayTasks();
        // Найдите индексы первого вхождения максимального элемента двумерного массива.
        // {{1, 2, 3, 3, 4, 5}, {6, 5, 4, 4, 2, 1}, {1, 2, 3, 3, 4, 4}, {9, 8, 7, 6, 5,
        // 6}};
        int[][] twoDimArray = { { 1, 2, 3, 3, 4, 5 }, { 6, 5, 4, 4, 2, 1 }, { 1, 2, 3, 3, 4, 4 },
                { 9, 8, 7, 6, 5, 6 } };
        System.out.println("\nИзначальный массив:\n");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "  ");
            }
            System.out.println("\n");
        }
        System.out.println("Индексы первого вхождения максмиального элемента: "
                + arrayTasks.indicesFirstOccurrenceMaximalElement(twoDimArray));

        // Дано нечетное число n, не превосходящее 15. Создайте двумерный массив из n×n
        // элементов, заполнив его символами "." (каждый элемент массива является
        // строкой из одного символа). Затем заполните символами "*" среднюю строку
        // массива, средний столбец массива, главную диагональ и побочную диагональ. В
        // результате "*" в массиве должны образовывать изображение звездочки. Выведите
        // полученный массив на экран, разделяя элементы массива пробелами.
        int n = 15;
        String[][] twoDimArray1 = new String[n][n];
        arrayTasks.snowflakeOutput(twoDimArray1);

        // Дано число n, не превышающее 100. Создайте массив размером n×n и заполните
        // его по следующему правилу. На главной диагонали должны быть записаны числа 0.
        // На двух диагоналях, прилегающих к главной, числа 1. На следующих двух
        // диагоналях числа 2, и т.д. Выведите полученный массив на экран, разделяя
        // элементы массива пробелами.
        int b = 100;
        n = b;
        int[][] twoDimArray2 = new int[n][n];
        arrayTasks.fillingFromMainDiagonal(twoDimArray2);
    }

}