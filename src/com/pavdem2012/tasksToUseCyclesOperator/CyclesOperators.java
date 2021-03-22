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
}
