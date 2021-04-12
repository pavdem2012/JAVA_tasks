package com.pavdem2012.textgame.cycles_operator;

public class Probe {

    public static void main(String[] args) {
        int[] a = new int[] { 236, 267, 973, 357 };
        int n = 1;
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            if (i + n >= a.length) {
                b[i + n - a.length] = a[i];
            } else {
                b[i + n] = a[i];
            }
        }
        for (int i : b) {
            System.out.println(i);
        }

    }

}
