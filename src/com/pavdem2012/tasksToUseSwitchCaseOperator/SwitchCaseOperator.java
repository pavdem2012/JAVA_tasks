package com.pavdem2012.tasksToUseSwitchCaseOperator;

public class SwitchCaseOperator {
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
               numberMonth = "1.";
               break;
            case "февраль":
               numberMonth = "2.";
               break;
            case "март":
               numberMonth = "3.";
               break;
            case "апрель":
               numberMonth = "4.";
               break;
            case "май":
               numberMonth = "5.";
               break;
            case "июнь":
               numberMonth = "6.";
               break;
            case "июль":
               numberMonth = "7.";
               break;
            case "август":
               numberMonth = "8.";
               break;
            case "сентябрь":
               numberMonth = "9.";
               break;
            case "октябрь":
               numberMonth = "10.";
               break;
            case "ноябрь":
               numberMonth = "11.";
               break;
            case "декабрь":
               numberMonth = "12.";
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

    /**
     * По номеру месяца определить количество дней в месяце.
     * @param number integer for proccesing
     * @return number of days in a month
     */
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
