package com.pavdem2012.textgame.arrays_operator;

public class ArraysOperators {
    /**
     * Создать массив символов из строки. Размер массива должен автоматически
     * рассчитываться. Вывести первый и последний элементы массива.
     * 
     * @param inputText this is text for processing
     * @return
     */
    public String countOfChars(String inputText) {
        char[] strToArray = inputText.toCharArray();
        char firstSymbol = strToArray[0];
        char lastSymbol = strToArray[strToArray.length - 1];
        int countOfchars = strToArray.length;
        String countOfChars = "Размер массива: " + countOfchars + " символов." + "\n" + "Первый символ: " + firstSymbol
                + "." + "\n" + "Последний символ: " + lastSymbol + ".";
        return countOfChars;

    }

    /**
     * Вывести одну цифру из середины целочисленного массива, если длинна массива не
     * чётная, иначе вывести 2 числа из середины
     * 
     * @param arrayForProcessing this is array for processing
     * @return digits from the middle of an integer array
     */
    public String getDigitFromArrayMiddle(int[] arrayForProcessing) {
        int k = arrayForProcessing.length;
        int f = k / 2;
        int x = k % 2;
        int middleDigit = 0;
        String compareString = "";
        if (x == 1) {
            middleDigit = arrayForProcessing[f];
            compareString = "\n" + "Цифра из середины нечетного массива: " + middleDigit + '.';
        }
        if (x == 0) {
            int firstDigit = arrayForProcessing[f - 1];
            int secondDigit = arrayForProcessing[f];
            compareString = "\n" + "Две цифры из середины четного массива: " + firstDigit + " и " + secondDigit + ".";
        }
        return compareString;
    }
}