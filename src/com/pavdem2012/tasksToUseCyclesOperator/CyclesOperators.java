package com.pavdem2012.tasksToUseCyclesOperator;

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
            if (i == 10)
                continue;
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
     * @param N int for proccesing
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
     * @param N int for proccesing
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
     * @param intList array for proccesing
     * @return the sum of all elements of a zero-terminated sequence.
     */
    public int sumOfEelementsSequenceToZero(int[] intList) {
        int sum = 0;
        for (int counter = 0; counter < intList.length; counter++) {
            if (intList[counter] == 0) {
                break;
            }
            sum = sum + intList[counter];
        }
        return sum;
    }
}
