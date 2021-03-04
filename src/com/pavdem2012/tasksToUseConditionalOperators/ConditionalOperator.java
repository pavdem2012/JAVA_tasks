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
     * Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны"
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

    /**
     * Написать программу, которая делает заглавной первую букву предложения(Если это необходимо), 
     * ставит точку в конце предложения.
     * @param inputText this is text for processing
     * @return capitalized text with a period at the end, if necessary.
     */
    public String firstToUpperCaseEndPoint (String inputText) {    
        inputText = inputText.trim();
        char[] symbolsArray = inputText.toCharArray();
        char firstSymbol = symbolsArray[0];
        if(firstSymbol != Character.toUpperCase(firstSymbol)) { 
            symbolsArray[0] = Character.toUpperCase(firstSymbol);        
        }
        String outputText = new String();
        outputText = String.valueOf(symbolsArray);
        char lastSymbol = symbolsArray[inputText.length()-1];
        if(lastSymbol != '.') {
            outputText = outputText + '.';    
        }
        return outputText ;
    }

    //Альтернативное решение
    public String firstToUpperCaseEndPointOther (String inputText) {
        inputText = inputText.trim();
        String firstSymbol = inputText.substring(0, 1);
        String processedText = inputText;
        if (!firstSymbol.equals(firstSymbol.toUpperCase())) {
            processedText = firstSymbol.toUpperCase() + inputText.substring(1, inputText.length());
        }
        if (!inputText.endsWith(".")) {
            processedText = processedText + ".";
        }
        return processedText;
    }
}
