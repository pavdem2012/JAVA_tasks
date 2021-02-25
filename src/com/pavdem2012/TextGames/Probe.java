package com.pavdem2012.TextGames;

public class Probe {

    public static void main(String[] args) {
        String str = "\"Вино бяка забродило\"";
        System.out.println(str);
        String newStr = str.replaceAll("бяка ", "");
        System.out.println(newStr);
    }

}
