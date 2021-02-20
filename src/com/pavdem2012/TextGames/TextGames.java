package com.pavdem2012.TextGames;

public class TextGames {

    public static void main(String[] args) {
    
    /**
     * Вывести строки "Паша любит рыбалку", "Обожаю придумывать настойки" и их длину.
     */
    String text1 = "\"Паша любит рыбалку\"";
    String text2 = "\"Обожаю придумывать настойки\"";
    TextGames textGames = new TextGames();
    System.out.println(textGames.getStringWithLength(text1));
    System.out.println(textGames.getStringWithLength(text2));
    
    /**
     * Вывести строку в верхнем регистре, вывести первоначальный вариант. "Перестань кричать"
     */
    String text3 = "\"Перестань кричать\"";
    System.out.println(textGames.getStringWithUpperCase(text3));

    /**
     * Вывести строку в нижнем регистре, вывести первоначальный вариант. "ТИХО СКАЗАЛ"
     */
    String text4 = "\"ТИХО СКАЗАЛ\"";
    System.out.println(textGames.getStringWithLowerCase(text4));
        
    /**
     * Убрать пробелы в начале и конце строки. Вывести результат. "                        Неопрен бяка рвётся сам         "
     */
    String text5 = "                        \"Неопрен бяка рвётся сам\"         ";
    System.out.println(textGames.getStringWithotTrim(text5));
    }
    /**
     * Вывести строки "Паша любит рыбалку", "Обожаю придумывать настойки" и их длину.
     * @param inputText this is text for processing
     * @return String with a text length information
     */
    public String getStringWithLength(String inputText) {
        String allText = inputText + ". " + "Длина текста: " + inputText.length() + ".\n";
        return allText;
    }
    /**
     * Вывести строку в верхнем регистре, вывести первоначальный вариант. "Перестань кричать"
     * @param inputText this is text for processing
     * @return String with a text in upper case and initial version of text4
     */
    public String getStringWithUpperCase(String inputText) {
        String allText = "В верхнем регистре: " + inputText.toUpperCase() + ".\nПервоначальный вариант: " + inputText + ".\n";
        return allText;
    }
    /**
     * Вывести строку в нижнем регистре, вывести первоначальный вариант. "ТИХО СКАЗАЛ"
     * @param inputText this is text for processing
     * @return String with a text in lower case and initial version of text4
     */
    public String getStringWithLowerCase(String inputText) {
        String allText = "В нижнем регистре: " + inputText.toLowerCase() + ".\nПервоначальный вариант: " + inputText + ".\n";
        return allText;
    }
    /**
     *  Убрать пробелы в начале и конце строки. Вывести результат. "                        Неопрен бяка рвётся сам         "
     * @param inputText this is text for processing
     * @return String without leading and trailing spaces
     */
    public String getStringWithotTrim(String inputText) {
        String allText = "Без пробелов в начале и конце: " + inputText.trim() + ".\nПервоначальный вариант: " + inputText + ".\n";
        return allText;
    }
}
