package com.pavdem2012.tasksToUseArraysOperator;

public class Main {

    public static void main(String[] args) {
        //Создать массив символов из строки. Размер массива должен автоматически рассчитываться.
        //Вывести первый и последний элементы массива.
        String text5 = "Лед встал господа присяжные заседатели";
        ArraysOperators arraysOperators = new ArraysOperators();
        System.out.println(arraysOperators.countOfChars(text5));

        //Вывести одну цифру из середины целочисленного массива, если длинна массива не чётная, 
        //иначе вывести 2 числа из середины.
        int [] array1 = {5,5,8,7,9,3,7,2};
        System.out.println(arraysOperators.getDigitFromArrayMiddle(array1));
    }

}
