package com.pavdem2012.textgame.functions_and_recursion;

public class FunctionsAndRecursion {

    /**
     * 
     * @param a any entered number.
     * @param b any entered number.
     * @return minimum of any two entered numbers.
     */
    public int getMin(int a, int b) {
        return Math.min(a, b);
    }

    /**
     * 
     * @param a any entered integer.
     * @param b any entered integer.
     * @param c any entered integer.
     * @param d any entered integer.
     * @return minimum of any four entered numbers.
     */
    public int getMin(int a, int b, int c, int d) {
        getMin(c, d);
        return Math.min(getMin(a, b), getMin(c, d));
    }

    /**
     * 
     * @param x1 any valid number entered.
     * @param x2 any valid number entered.
     * @param y1 any valid number entered.
     * @param y2 any valid number entered.
     * @return distance between point (x1. y1) and (x2, y2).
     */
    public double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
