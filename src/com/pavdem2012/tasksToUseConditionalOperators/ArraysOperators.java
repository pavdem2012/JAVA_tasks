package com.pavdem2012.tasksToUseConditionalOperators;

public class ArraysOperators {
    /**
     * Создать массив символов из строки. Размер массива должен автоматически рассчитываться.
     * Вывести первый и последний элементы массива.
     * @param inputText this is text for processing
     * @return 
     */
    public String countOfChars(String inputText) {
        char[]strToArray = inputText.toCharArray();
        char firstSymbol = strToArray[0];
        char lastSymbol = strToArray[strToArray.length - 1];
        int countOfchars = strToArray.length;
        String countOfChars = "\n \nРазмер массива: " + countOfchars + " символов." + "\n" 
        + "Первый символ: " + firstSymbol +"." + "\n" + "Последний символ: " + lastSymbol + ".";
        return countOfChars;
        
    }
}
