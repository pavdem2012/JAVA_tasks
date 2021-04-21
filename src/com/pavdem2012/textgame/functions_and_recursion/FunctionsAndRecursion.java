package com.pavdem2012.textgame.functions_and_recursion;

public class FunctionsAndRecursion {

    public int returnMin2(int a, int b) {
        int X;
        if (a < b) {
            X = a;
        } else {
            X = b;
        }
        return X;
    }

    public int returnMin4(int a, int b, int c, int d) {
        int s = returnMin2(a, b);
        int x;
        int y;
        if (c < d) {
            x = c;
        } else {
            x = d;
        }
        if (s < x) {
            y = s;
        } else {
            y = x;
        }
        return y;
    }
}
