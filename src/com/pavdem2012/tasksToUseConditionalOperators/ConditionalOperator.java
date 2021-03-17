package com.pavdem2012.tasksToUseConditionalOperators;

public class ConditionalOperator {
    /**
     * Вывод сообщения "В переменной типа integer хранится " и число прописью.
     * @param number this is number for processing.
     * @return number in words.
     */
    public String detectNumber (Integer number) {
        String numberString; 
        switch (number) {
            case 2:
              numberString = "два";
              break;
            case 3:
              numberString = "три";
              break;
            case 4:
              numberString = "четыре";
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

    /**Альтернативное решение
     * Написать программу, которая делает заглавной первую букву предложения(Если это необходимо), 
     * ставит точку в конце предложения.
     * @param inputText this is text for processing
     * @return capitalized text with a period at the end, if necessary.
     */
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

    /**
     * В корзине несколько яблок. Если одно яблоко то вывести "Яблоко одно",
     * Если яблок меньше трёх, то "Мало яблок", если яблок 3 или больше, 
     * то "Яблок хватит всем"
     * @param inputText this is text for processing
     * @return message about count of apple
     */
    public String appleCounter (String inputText) {
        String regex = "[^\\d]+";
        String[] str = inputText.split(regex);
        String appleCountString = str[1];
        int appleCount = Integer.parseInt(appleCountString);
        String processedText = "";
        if (appleCount==1) {
            processedText = "Яблоко одно";
        }
        else if (appleCount < 3) {
            processedText = "Мало яблок";
        }
        else if (appleCount >= 3) {
            processedText = "Яблок хватит всем";
        }
        return processedText;
    }
    /**
     * Если в строке описывающей коризну есть "яблоки" или "груши" или "апельсины"
     * то вывести Фрукты. Если в строке описывающей корзину есть одновременно слова
     * "специи" и "овощи" и "мясо", тогда вывести "суповой набор"
     * @param inputText this is text for processing
     * @return message about basket composition.
     */
    public String checkingBasket (String inputText) {
        String stage1 = inputText.toLowerCase();
        String processedText = "";
        if (stage1.contains("яблок") | stage1.contains("груш") | stage1.contains("апельсин")) {
            processedText = "Фрукты";
        }        
        if (stage1.contains("специи") & stage1.contains("овощи") & stage1.contains("мясо")) {
            processedText = "Суповой набор";
        }
        if (stage1.contains("специи") & stage1.contains("овощи") & stage1.contains("мясо") & stage1.contains("яблок") & stage1.contains("груш") & stage1.contains("апельсин")) {
            processedText = "Хватал всё подряд";
        }
        else {
            processedText = "В корзине нет нужных продуктов";
        }
        return processedText;
    }

    /**
     * Дано название месяца прописью, вывести его порядковый номер. 
     * Если в названии месяца есть ошибка, то вывести "Ошибка". 
     * Регистр букв и наличие пробелов в начале или конце не должны влиять на работу программы.
     * @param inputText  this is text for processing
     * @return either a message about the ordinal number of the month, or an error message
     */
    public String detectNumberMonth (String inputText) {
        inputText = inputText.trim();
        inputText = inputText.toLowerCase();
        String numberMonth; 
        switch (inputText) {
            case "январь":
               numberMonth = "1";
               break;
            case "февраль":
               numberMonth = "2";
               break;
            case "март":
               numberMonth = "3";
               break;
            case "апрель":
               numberMonth = "4";
               break;
            case "май":
               numberMonth = "5";
               break;
            case "июнь":
               numberMonth = "6";
               break;
            case "июль":
               numberMonth = "7";
               break;
            case "август":
               numberMonth = "8";
               break;
            case "сентябрь":
               numberMonth = "9";
               break;
            case "октябрь":
               numberMonth = "10";
               break;
            case "ноябрь":
               numberMonth = "11";
               break;
            case "декабрь":
               numberMonth = "12";
               break;
            default:
               numberMonth = "\"ошибка\"";
        }
        return numberMonth;
    }

    /**
     * Переменная содержит код языка. МОгут быть три варианта: "en", "ru", "fr". 
     * Вывести дни недели через запятую, на заданном языке, в зависимости от кода языка.
     * @param inputText this is text for processing
     * @return the names of the days of the week in the selected language
     */
    public String outputNamesOfDays (String inputText) {
        inputText = inputText.trim();
        inputText = inputText.toLowerCase();
        String namesOfDays; 
        switch (inputText) {
            case "en":
              namesOfDays = "monday, tuesday, wednesday, thursday, friday, saturday, sunday.";
              break;
            case "ru":
              namesOfDays = "ПОНЕДЕЛЬНИК, ВТОРНИК, СРЕДА, ЧЕТВЕРГ, ПЯТНИЦА, СУББОТА, ВОСКРЕСЕНЬЕ.";
              break;
            case "fr":
              namesOfDays = "lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche.";
              break;
            default:
              namesOfDays = "\"ошибка ввода\"";
        }
        return namesOfDays;
    }

    public String detectCountOfDay(Integer number) {
        String countOfDay; 
        switch (number) {
            case 1:
              countOfDay = "31";
              break;
            case 2:
              countOfDay = "28";
              break;
            case 3:
              countOfDay = "31";
              break;
            case 4:
              countOfDay = "30";
              break;
            case 5:
              countOfDay = "31";
              break;
            case 6:
              countOfDay = "30";
              break;
            case 7:
              countOfDay = "31";
              break;
            case 8:
              countOfDay = "31";
              break;
            case 9:
              countOfDay = "30";
              break;
            case 10:
              countOfDay = "31";
              break;
            case 11:
              countOfDay = "30";
              break;
            case 12:
              countOfDay = "31";
              break;
            default:
              countOfDay = "\"нет такого месяца\"";
        }
        return countOfDay;
    }
}
