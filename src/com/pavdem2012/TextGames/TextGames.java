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
    }
    
    /**
     * Вывести строки "Паша любит рыбалку", "Обожаю придумывать настойки" и их длину.
     * @param text1 this is text for processing
     * @param text2 this is text for processing
     * @return String with a text length information
     */
    public String getStringWithLength(String inputText) {
        String allText = inputText + ". " + "Длина текста: " + inputText.length() + ".\n";
        return allText;
    }
    /**
     * Вывести строку в верхнем регистре, вывести первоначальный вариант. "Перестань кричать"
     * @param text3 this is text for processing
     * @return String with a text in upper case and initial version of text4
     */
    public String getStringWithUpperCase(String inputText) {
        String allText = "В верхнем регистре: " + inputText.toUpperCase() + ".\nПервоначальный вариант: " + inputText + ".\n";
        return allText;
    }
    /**
     * Вывести строку в нижнем регистре, вывести первоначальный вариант. "ТИХО СКАЗАЛ"
     * @param text4 this is text for processing
     * @return String with a text in lower case and initial version of text4
     */
    public String getStringWithLowerCase(String inputText) {
        String allText = "В нижнем регистре: " + inputText.toLowerCase() + ".\nПервоначальный вариант: " + inputText + ".\n";
        return allText;
    }
}
