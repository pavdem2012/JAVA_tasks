package com.pavdem2012.TextGames;

public class Probe {

    public static void main(String[] args) {
        String line = "This order was32354 placed for QT ! OK?";
        String regex = "[^\\d]+";

        String[] str = line.split(regex);

        System.out.println(str[1]);
    }

}
