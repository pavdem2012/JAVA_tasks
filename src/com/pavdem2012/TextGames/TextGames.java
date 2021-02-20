package com.pavdem2012.TextGames;

public class TextGames {

    public static void main(String[] args) {
        /**
         * Вывести строки "Паша любит рыбалку", "Обожаю придумывать настойки" и их длину.
         */
        String text = new String("Паша любит рыбалку");
        String text1 = new String("Обожаю придумывать настойки");

        System.out.print("Длина строки \"Паша любит рыбалку\" - " );
        System.out.println(text.length());

        System.out.print("Длина строки \"Обожаю придумывать настойки\" - " );
        System.out.println(text1 .length());
        
        /**
         * Вывести строку в верхнем регистре, вывести первоначальный вариант. "Перестань кричать"
         */
        String text2 = new String("Перестань кричать");
        System.out.print("В верхнем регистре: ");
        System.out.println(text2.toUpperCase());
        System.out.print("Первоначальный вариант: ");
        System.out.println(text2);

        /**
         * Вывести строку в нижнем регистре, вывести первоначальный вариант. "ТИХО СКАЗАЛ"
         */
        String text3 = new String("ТИХО СКАЗАЛ");
        System.out.print("В нижнем регистре: ");
        System.out.println(text3.toLowerCase());
        System.out.print("Первоначальный вариант: ");
        System.out.println(text3);
    }

}
