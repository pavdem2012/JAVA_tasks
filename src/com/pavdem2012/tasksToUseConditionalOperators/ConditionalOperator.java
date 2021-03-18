package com.pavdem2012.tasksToUseConditionalOperators;

public class ConditionalOperator {

    /**
     * Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны"
     * 
     * @param number this is number for processing.
     * @return the highest value is either "Числа равны".
     */
    public String compareNumber(Integer a, Integer b) {
        String compareString = "";
        if (a == b) {
            compareString = "Числа равны.";
        } else if (a < b) {
            compareString = "Наибольшее число: " + String.valueOf(b);
        } else if (b < a) {
            compareString = "Наибольшее число: " + Integer.toString(a);
        }
        return compareString;
    }

    /**
     * Написать программу, которая делает заглавной первую букву предложения(Если
     * это необходимо), ставит точку в конце предложения.
     * 
     * @param inputText this is text for processing
     * @return capitalized text with a period at the end, if necessary.
     */
    public String firstToUpperCaseEndPoint(String inputText) {
        inputText = inputText.trim();
        char[] symbolsArray = inputText.toCharArray();
        char firstSymbol = symbolsArray[0];
        if (firstSymbol != Character.toUpperCase(firstSymbol)) {
            symbolsArray[0] = Character.toUpperCase(firstSymbol);
        }
        String outputText = new String();
        outputText = String.valueOf(symbolsArray);
        char lastSymbol = symbolsArray[inputText.length() - 1];
        if (lastSymbol != '.') {
            outputText = outputText + '.';
        }
        return outputText;
    }

    /**
     * Альтернативное решение Написать программу, которая делает заглавной первую
     * букву предложения(Если это необходимо), ставит точку в конце предложения.
     * 
     * @param inputText this is text for processing
     * @return capitalized text with a period at the end, if necessary.
     */
    public String firstToUpperCaseEndPointOther(String inputText) {
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

    /**
     * В корзине несколько яблок. Если одно яблоко то вывести "Яблоко одно", Если
     * яблок меньше трёх, то "Мало яблок", если яблок 3 или больше, то "Яблок хватит
     * всем"
     * 
     * @param inputText this is text for processing
     * @return message about count of apple
     */
    public String appleCounter(String inputText) {
        String regex = "[^\\d]+";
        String[] str = inputText.split(regex);
        String appleCountString = str[1];
        int appleCount = Integer.parseInt(appleCountString);
        String processedText = "";
        if (appleCount == 1) {
            processedText = "Яблоко одно.";
        } else if (appleCount < 3) {
            processedText = "Мало яблок.";
        } else if (appleCount >= 3) {
            processedText = "Яблок хватит всем.";
        }
        return processedText;
    }

    /**
     * Если в строке описывающей коризну есть "яблоки" или "груши" или "апельсины"
     * то вывести Фрукты. Если в строке описывающей корзину есть одновременно слова
     * "специи" и "овощи" и "мясо", тогда вывести "суповой набор"
     * 
     * @param inputText this is text for processing
     * @return message about basket composition.
     */
    public String checkingBasket(String inputText) {
        String stage1 = inputText.toLowerCase();
        String processedText = "";
        if (stage1.contains("яблок") | stage1.contains("груш") | stage1.contains("апельсин")) {
            processedText = "Фрукты.";
        }
        if (stage1.contains("специи") & stage1.contains("овощи") & stage1.contains("мясо")) {
            processedText = "Суповой набор.";
        }
        if ((stage1.contains("специи") | stage1.contains("овощи") | stage1.contains("мясо"))
                & (stage1.contains("яблок") | stage1.contains("груш") | stage1.contains("апельсин"))) {
            processedText = "Хватал всё подряд.";
        }
        if (!stage1.contains("специи") & !stage1.contains("овощи") & !stage1.contains("мясо")
                & !stage1.contains("яблок") & !stage1.contains("груш") & !stage1.contains("апельсин")) {
            processedText = "В корзине нет нужных продуктов.";
        }
        return processedText;
    }
}
