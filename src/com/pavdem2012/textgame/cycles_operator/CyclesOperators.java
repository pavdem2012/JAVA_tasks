package com.pavdem2012.textgame.cycles_operator;

public class CyclesOperators {
    /**
     * Дана переменная n. Вывести факториал n.
     * 
     * @param n int for proccesing
     * @return factorial of number n
     */
    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Даны две переменные: x, y. Вычислить x в степени y.
     * 
     * @param x int for proccesing
     * @param y int for proccesing
     * @return x to the power of y
     */
    public int degreeCalculator(int x, int y) {
        int j = 1;
        for (int i = 0; i < y; i = i + 1) {
            j *= x;
        }
        return j;
    }

    /**
     * Вывести массив типа boolean в обратном порядке используя цикл со счётчиком.
     * 
     * @param arrayForProcessing array for processing
     * @return boolean array in reverse order as string
     */
    public String reverseArray(boolean[] arrayForProcessing) {
        String processedText = "";
        for (int i = arrayForProcessing.length - 1; i >= 0; i--) {
            processedText += arrayForProcessing[i] + " ";
        }
        return processedText;
    }

    /**
     * Массив типа char выводить символы пока не встретится пробел.
     * 
     * @param inputText text for processing.
     * @return an array of characters up to the first space.
     */
    public String arrayToSpace(String inputText) {
        String outputText = "";
        char[] strToArray = inputText.toCharArray();
        for (int i = 0; strToArray[i] != ' '; i++) {
            outputText += strToArray[i];
        }
        return outputText;
    }

    /**
     * Альтернативное решение Массив типа char выводить символы пока не встретится
     * пробел.
     * 
     * @param inputText text for processing.
     * @return an array of characters up to the first space.
     */
    public String arrayToSpaceAlternative(String inputText) {
        String outputText = "";
        char[] strToArray = inputText.toCharArray();
        int i = 0;
        while (strToArray[i] != ' ') {
            outputText += strToArray[i];
            i++;
        }
        return outputText;
    }

    /**
     * По данному числу N вывести все целые степени двойки, не превосходящие N, в
     * порядке возрастания. Например: 1 2 4 8 16 32 для N=52
     * 
     * @param N int for processing
     * @return all integer powers of two not exceeding N
     */
    public String integerPowersOfTwo(int N) {
        String outputText = "";
        int x = 1;
        while (x < N) {
            outputText += x + ";" + " ";
            x *= 2;
        }
        return outputText;
    }

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной
     * степенью двойки, или слово NO в противном случае.
     * 
     * @param N int for processing
     * @returnthe word YES if the number N is an exact power of two, or the word NO
     *            otherwise.
     */
    public String exactPowerOfTwo(int N) {
        String outputText = "";
        int x = 1;
        while (x < N) {
            x = x * 2;
        }
        if (x == N) {
            outputText = "YES";
        } else {
            outputText = "NO";
        }
        return outputText;
    }

    /**
     * Определите сумму всех элементов последовательности, завершающейся числом 0.
     * Массив {3,2,3,5,0,7,5,4}
     * 
     * @param intList array for processing
     * @return the sum of all elements of a zero-terminated sequence.
     */
    public int getMaxItemCount(int[] intList) {
        int sum = 0;
        for (int counter = 0; counter < intList.length; counter++) {
            if (intList[counter] == 0) {
                break;
            }
            sum = sum + intList[counter];
        }
        return sum;
    }

    /**
     * Последовательность состоит из натуральных чисел и завершается числом 0.
     * Определите, какое количество элементов этой последовательности, равны ее
     * наибольшему элементу. {3,5,1,5,2,3,5,0,7,5,4}
     * 
     * @param intList1 array for processing
     * @return the number of largest elements of the sequence to zero
     */
    public int numberOfLargestElementsSequence(int[] intList1) {
        int max = 0;
        int numMax = 0;
        int number = -1;
        int counter = 0;
        while (number != 0) {
            number = intList1[counter];
            counter++;
            if (number > max) {
                max = number;
                numMax = 1;
            } else if (number == max) {
                numMax += 1;
            }
        }
        return numMax;
    }

    /**
     * Вывести все элементы массива с четными индексами {3,5,1,5,2,3,5,0,7,5,4}
     * 
     * @param intList1 array for processing
     * @return all array elements with even indices
     */

    public String allElementsWithEvenIndex(int[] intList1) {
        String processedText = "";
        int evenIndex = 0;
        for (int index = 0; index < intList1.length; index++) {
            evenIndex = intList1[index];
            if (index % 2 == 0) {
                processedText += evenIndex + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Вывести все четные элементы массива {3,5,1,5,2,3,5,0,7,5,4}.
     * 
     * @param intList1 array for processing
     * @return all even elements of the array.
     */
    public String allEvenElements(int[] intList1) {
        String processedText = "";
        int evenIndex = 0;
        for (int index = 0; index < intList1.length; index++) {
            evenIndex = intList1[index];
            if (evenIndex % 2 == 0) {
                processedText += evenIndex + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Найти количество положительных элементов в данном массиве. {1,-2,3,-4,5}
     * 
     * @param intList2 array for processing
     * @return the number of positive elements in the given array
     */
    public int numberOfPositiveElementsInArray(int[] intList2) {
        int counter = 0;
        int number = 0;
        for (int i = 0; i < intList2.length; i++) {
            number = intList2[i];
            if (number > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Дан массив чисел. Выведите все элементы массива, которые больше предыдущего
     * элемента . {1,5,2,4,3}
     * 
     * @param intList3 array for processing
     * @return array elements that are larger than the previous one
     */
    public String elementsAreLargerPreviousOne(int[] intList3) {
        String processedText = "";
        int index = 0;
        int previousIndex = 0;
        for (int i = 1; i < intList3.length; i++) {
            index = intList3[i];
            previousIndex = intList3[i - 1];
            if (index > previousIndex) {
                processedText += index + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака,
     * выведите эти числа. Если соседних элементов одного знака нет - не выводите
     * ничего. Если таких пар соседей несколько - выведите первую пару.
     * {-1,2,3,-1,-2}
     * 
     * @param intList4 array for processing
     * @return two adjacent elements of the same sign
     */
    public String twoAdjacentElements(int[] intList4) {
        String processedText = "";
        int previousNumber = 0;
        int number = 0;
        for (int i = 1; i < intList4.length; i++) {
            previousNumber = intList4[i - 1];
            number = intList4[i];
            if (previousNumber > 0 & number > 0 | previousNumber < 0 & number < 0) {
                processedText = "\n" + "Соседние элементы одного знака: " + previousNumber + ";" + " " + number + ";"
                        + " " + "\n";
                break;
            }
        }
        return processedText;
    }

    /**
     * Выведите значение наименьшего из всех положительных элементов в массиве.
     * Известно, что в массиве есть хотя бы один положительный элемент.
     * {5,-4,3,-2,1}
     * 
     * @param intList5 array for processing
     * @return smallest of all positive elements in the array
     */
    public String smallestOfPositiveElements(int[] intList5) {
        String processedText = "";
        int min = 0;
        int number = 0;
        for (int i = 0; i < intList5.length; i++) {
            number = intList5[i];
            if (number > 0) {
                min = number;
            }
            if (min < intList5[i]) {
                min = number;
            }
            processedText = "\n" + "Наименьший из положительных элементов: " + min + ";" + "\n";
        }
        return processedText;
    }
}
