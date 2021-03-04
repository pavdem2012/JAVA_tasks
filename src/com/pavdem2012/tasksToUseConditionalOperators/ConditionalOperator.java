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
    
    
}
