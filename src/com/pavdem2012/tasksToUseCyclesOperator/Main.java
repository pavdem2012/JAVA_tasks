package com.pavdem2012.tasksToUseCyclesOperator;

public class Main {

    public static void main(String[] args) {
        //Дана переменная n. Вывести факториал n.
        int n = 0;
        CyclesOperators cyclesOperators = new CyclesOperators();
        System.out.println("Факториал числа n = " + cyclesOperators.calculateFactorial(n) + ".");

        //Даны две переменные: x, y. Вычислить x в степени y.
        int x = 3;
        int y = 3;
        System.out.println("\nx^y = " + cyclesOperators.degreeCalculator(x , y) + ".");
    }
}
