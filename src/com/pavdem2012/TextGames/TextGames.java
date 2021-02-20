package com.pavdem2012.TextGames;

public class TextGames {

    public static void main(String[] args) {
        String Str1 = new String("Паша любит рыбалку");
        String Str2 = new String("Обожаю придумывать настойки");

        System.out.print("Длина строки \"Паша любит рыбалку\" - " );
        System.out.println(Str1.length());

        System.out.print("Длина строки \"Обожаю придумывать настойки\" - " );
        System.out.println(Str2.length());
        
        String Str = new String("Перестань кричать");
        System.out.print("В верхнем регистре: ");
        System.out.println(Str.toUpperCase());
        System.out.print("Первоначальный вариант: ");
        System.out.println(Str);

        String Str3 = new String("ТИХО СКАЗАЛ");
        System.out.print("В нижнем регистре: ");
        System.out.println(Str3.toLowerCase());
        System.out.print("Первоначальный вариант: ");
        System.out.println(Str3);
    }

}
