package com.pavdem2012.textgame.array_tasks;

public class ArrayTasks {

    /**
     * Найдите индексы первого вхождения максимального элемента двумерного массива.
     * 
     * @param numberArray array for processing
     * @return the indices of the first occurrence of an element in a
     *         two-dimensional array.
     */
    public String indicesFirstOccurrenceMaximalElement(int[][] numberArray) {
        String indicesFirstOccurrenceMaximalElement = "";
        int cashI = 0;
        int cashJ = 0;
        int max = numberArray[0][0];
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                if (numberArray[i][j] > max) {
                    max = numberArray[i][j];
                    cashI = i;
                    cashJ = j;
                    indicesFirstOccurrenceMaximalElement = "" + cashI + "; " + cashJ + ";";
                }
            }
        }
        System.out.println("Максимальный элемент массива: " + max + ";\n");
        return indicesFirstOccurrenceMaximalElement;
    }

    /**
     * Дано нечетное число n, не превосходящее 15. Создайте двумерный массив из n×n
     * элементов, заполнив его символами "." (каждый элемент массива является
     * строкой из одного символа). Затем заполните символами "*" среднюю строку
     * массива, средний столбец массива, главную диагональ и побочную диагональ. В
     * результате "*" в массиве должны образовывать изображение звездочки. Выведите
     * полученный массив на экран, разделяя элементы массива пробелами.
     * 
     * @param charArray array for processing
     */
    public void snowflakeOutput(String[][] charArray) {
        int n = 15;
        System.out.println("\nМассив n x n заполненный (.):\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                charArray[i][j] = ".";
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nМассив со снежинкой:\n");
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                if (j == n / 2 || i == n / 2 || i == j || i == n - 1 - j) {
                    charArray[i][j] = "*";
                }
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillingFromMainDiagonal(int[][] numberArray) {
        System.out.println("\nЗаполненный массив:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) Math.abs(i - j);
                if (i == j) {
                    numberArray[i][j] = 0;
                }
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Дан двумерный массив и два числа: i и j. Поменяйте в массиве столбцы с
     * номерами i и j 
     * 
     * @param numberArray array for processing;
     * @param x column number
     * @param y other column number
     */
    public void permutationOfColumns(int[][] numberArray, int x, int y) {
        int a = numberArray[0].length;
        if (x > a - 1 || y > a - 1) {
            System.out.println("\nНомер столбца находится за пределлами массива, введите другое значение.");
        } else {
            System.out.println("\nИзначальный массив:\n");
            for (int i = 0; i < numberArray.length; i++) {
                for (int j = 0; j < numberArray[i].length; j++) {
                    System.out.print(numberArray[i][j] + "  ");
                }
                System.out.println("\n");
            }
            System.out.println("\nМассив с поменяными столбцами:\n");
            int cash;
            for (int i = 0; i < numberArray.length; i++) {
                cash = numberArray[i][x];
                numberArray[i][x] = numberArray[i][y];
                numberArray[i][y] = cash;
                for (int j = 0; j < numberArray[i].length; j++) {
                    System.out.print(numberArray[i][j] + "  ");
                }
                System.out.println("\n");
            }
        }
    }
}
