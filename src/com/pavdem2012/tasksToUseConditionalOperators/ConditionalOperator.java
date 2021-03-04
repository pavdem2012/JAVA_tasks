package com.pavdem2012.tasksToUseConditionalOperators;

public class ConditionalOperator {
    /**
     * Вывод сообщения "В переменной integer хранится " и число прописью.
     * @param number this is number for processing.
     * @return number in words.
     */
    public String detectNumber (Integer number) {
        String numberString; 
        switch (number) {
            case 2:  numberString = "два";
                 break;
            case 3:  numberString = "три";
                 break;
            case 4:  numberString = "четыре";
                 break;
            default:
                numberString = "\"необрабатываемое значение\"";
        }
        return numberString;
    }
    
    /**
     * Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны."
     * @param number this is number for processing.
     * @return the highest value is either "Числа равны".
     */
    public String compareNumber (Integer a, Integer b) {
        String compareString = "";
        if (a==b) {
            compareString = "Числа равны.";
        }
        else if (a<b) {
            compareString = "Наибольшее число: " + String.valueOf(b);
        }
        else if (b<a) {
            compareString = "Наибольшее число: " + Integer.toString(a);
        }
        return compareString;
        
    }
}
