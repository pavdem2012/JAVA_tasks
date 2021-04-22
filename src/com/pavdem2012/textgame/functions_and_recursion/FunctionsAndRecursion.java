package com.pavdem2012.textgame.functions_and_recursion;

public class FunctionsAndRecursion {

    /**
     * 
     * @param a any entered number.
     * @param b any entered number.
     * @return minimum of any two entered numbers.
     */
    public int getMin(int a, int b) {
        int s;
        if (a < b) {
            s = a;
        } else {
            s = b;
        }
        return s;
    }

    /**
     * 
     * @param a any entered number.
     * @param b any entered number.
     * @param c any entered number.
     * @param d any entered number.
     * @return minimum of any four entered numbers.
     */
    public int getMin(int a, int b, int c, int d) {
        int s = getMin(a, b);
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
