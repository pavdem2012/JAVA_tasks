package com.pavdem2012.textgame.array_tasks;

public class ArrayTasks {

    /**
     * Найдите индексы первого вхождения максимального элемента двумерного массива.
     * 
     * @param numberArray array for processing;
     * @return the indices of the first occurrence of an element in a
     *         two-dimensional array.
     */
    public String getMaxElement(int[][] numberArray) {
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
     * @param n         array size;
     * 
     * @param charArray array for processing;
     */
    public void printSnowFlake(int n) {
        String[][] charArray = new String[n][n];
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

    /**
     * Дано число n, не превышающее 100. Создайте массив размером n×n и заполните
     * его по следующему правилу. На главной диагонали должны быть записаны числа 0.
     * На двух диагоналях, прилегающих к главной, числа 1. На следующих двух
     * диагоналях числа 2, и т.д. Выведите полученный массив на экран, разделяя
     * элементы массива пробелами.
     * 
     * @param numberArray array for processing;
     */
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
     * @param x           column number;
     * @param y           other column number;
     */
    public void permutationOfColumns(int[][] numberArray, int x, int y) {
        int a = numberArray[0].length;
        if (x > a - 1 || y > a - 1) {
            System.out.println("\nНомер столбца находится за пределлами массива, введите другое значение.");
        } else {
            System.out.println("\nИзначальный массив:\n");
            for (int i = 0; i < numberArray.length; i++) {
                for (int j = 0; j < numberArray[i].length; j++) {
                    System.out.print(numberArray[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("\nМассив с поменяными столбцами:\n");
            int cash;
            for (int i = 0; i < numberArray.length; i++) {
                cash = numberArray[i][x];
                numberArray[i][x] = numberArray[i][y];
                numberArray[i][y] = cash;
                for (int j = 0; j < numberArray[i].length; j++) {
                    System.out.print(numberArray[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    /**
     * Дано число n, не превосходящее 10, и массив размером n × n. Проверьте,
     * является ли этот массив симметричным относительно главной диагонали. Выведите
     * слово “YES”, если массив симметричный, и слово “NO” в противном случае.
     * 
     * @param numberArray array for processing;
     * @param n           size and maximum number of array;
     */
    public void checkingSymmetryArray(int[][] numberArray, int n) {
        System.out.println("\nПолученый массив:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) (Math.random() * n);
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
        String Output = "";
        int nonconformityCounter = 0;
        int cashI = 0;
        int cashJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cashI = numberArray[i][j];
                cashJ = numberArray[j][i];
                if (cashI != cashJ) {
                    nonconformityCounter++;
                }
                if (nonconformityCounter > 0) {
                    Output = "NO";
                } else {
                    Output = "YES";
                }
            }
        }
        System.out.println("\n" + Output);
    }

    /**
     * "В кинотеатре n рядов по m мест в каждом (n и m не превосходят 20). В
     * двумерном массиве хранится информация о проданных билетах, число 1 означает,
     * что билет на данное место уже продан, число 0 означает, что место свободно.
     * Поступил запрос на продажу k билетов на соседние места в одном ряду.
     * Определите, можно ли выполнить такой запрос. Программа должна вывести номер
     * ряда, в котором есть k подряд идущих свободных мест. Если таких рядов
     * несколько, то выведите номер наименьшего подходящего ряда. Если подходящего
     * ряда нет, выведите число 0."
     * 
     * @param n the number of rows in the cinema;
     * @param m number of seats in a row;
     * @param k the required number of seats nearby;
     */
    public void checkingFreeSeats(int n, int m, int k) {
        if (k > m) {
            System.out.println("\nРяд кинотеатра вмещает всего " + m + " мест.");
            return;
        }
        int[][] numberArray = new int[n][m];
        System.out.println("\nПлан кинозала с продаными билетами:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) (Math.random() * 2);
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
        Integer emptyPlace = null;
        for (int i = 0; i < n; i++) {
            emptyPlace = 0;
            for (int j = 0; j < m; j++) {
                if (numberArray[i][j] == 0) {
                    emptyPlace++;
                    if (emptyPlace == k) {
                        System.out.println("\nВозможно приобрести билеты в " + (i + 1) + " ряд.");
                        break;
                    }
                } else {
                    emptyPlace = 0;
                }
            }
            if (emptyPlace == k) {
                break;
            }
        }
        if (emptyPlace != k) {
            System.out.println("\nБилетов по вашему запросу 0.");
        }
    }

    /**
     * Дан прямоугольный массив размером n×m. Поверните его на 90 градусов по
     * часовой стрелке, записав результат в новый массив размером m×n.
     * 
     * @param n number in the original array lines;
     * @param m number in the original array columns;
     */
    public void rotationArray(int n, int m) {
        int[][] numberArray = new int[n][m];
        int[][] temporary = new int[m][n];
        System.out.println("\nНаполненный изначальный масив:\n");
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                numberArray[i][j] = (int) (Math.random() * m);
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temporary[j][n - 1 - i] = numberArray[i][j];
            }
        }
        System.out.println("\nМасив повернутый на 90':\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temporary[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
