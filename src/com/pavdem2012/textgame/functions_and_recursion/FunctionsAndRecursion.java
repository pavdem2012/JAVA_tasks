package com.pavdem2012.textgame.functions_and_recursion;

public class FunctionsAndRecursion {

    /**
     * 
     * @param a any entered number.
     * @param b any entered number.
     * @return minimum of any two entered numbers.
     */
    public int getMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
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
        return getMin(getMin(a, b), getMin(c, d));
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

    /**
     * "Дано действительное положительное число f и целоe число n. Вычислите f в
     * степени n. Решение оформите в виде рекурсивной функции power(f, n)."
     * 
     * @param f any valid number entered.
     * @param n any entered integer.
     * @return f to power n.
     * @throws Exception critical exponentiation error.
     */
    public double power(double f, int n) throws Exception {
        if (f == 0 & n == 0) {
            throw new Exception("\nНоль в нулевой степени неопределён и лишён смысла!!!");
        }
        if (n < 0) {
            throw new Exception("\nCтепень должна быть >= 0!!!");
        }
        if (n == 0) {
            return 1;
        }
        return f * power(f, n - 1);
    }
}
