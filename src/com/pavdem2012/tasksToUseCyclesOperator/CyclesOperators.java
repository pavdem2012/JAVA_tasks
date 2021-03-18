package com.pavdem2012.tasksToUseCyclesOperator;

public class CyclesOperators {
    /**
     * Дана переменная n. Вывести факториал n.
     * @param n int for proccesing
     * @return factorial of number n
     */
    public int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            if (i==10)
                continue;
            result = result*i;
        }
        return result;
    }

    /**.
     * Даны две переменные: x, y. Вычислить x в степени y.
     * @param x int for proccesing
     * @param y int for proccesing
     * @return x to the power of y
     */
    public int degreeCalculator(int x, int y) {
        int j = 1;
        for(int i = 0; i < y; i=i+1) {
            j*= x;
        }
        return(j);
    }
}
