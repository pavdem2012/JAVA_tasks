package com.pavdem2012.tasksToUseConditionalOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        //В переменной типа integer хранится число 2 или 3 или 4. 
        //Вывести сообщение"В переменной типа integer хранится " 
        //и число прописью.
        Integer number = 3;
        SwitchCaseOperator switchCaseOperator = new SwitchCaseOperator();
        System.out.print("В переменной типа Integer хранится число " + switchCaseOperator.detectNumber(number) + ".");

        //Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны."
        Integer a = 5;
        Integer b = 5;
        ConditionalOperator conditionalOperator = new ConditionalOperator();
        System.out.println("\n" + "\n" + conditionalOperator.compareNumber(a, b));

        //Написать программу, которая делает заглавной первую
        //букву предложения(Если это необходимо),
        //ставит точку в конце предложения.  Строку взять любую 
        //из предыдущих, без точки.
        String text = "   перестань кричать ";
        System.out.println("\n" + conditionalOperator.firstToUpperCaseEndPoint(text));

        //Альтернативное решение
        System.out.println("\n" + conditionalOperator.firstToUpperCaseEndPointOther(text));

        //В корзине несколько яблок. Если одно яблоко то вывести "Яблоко одно",
        //Если яблок меньше трёх, то "Мало яблок", если яблок 3 или больше, то "Яблок хватит всем"
        String text1 = "В корзине 3 яблока";
        System.out.println("\n" + conditionalOperator.appleCounter(text1));

        //Если в строке описывающей коризну есть "яблоки" или "груши" или "апельсины" 
        //то вывести Фрукты. Если в строке описывающей корзину есть одновременно слова 
        //"специи" и "овощи" и "мясо", тогда вывести "суповой набор"
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + "В корзине видно: ");
        String text2 = in.nextLine();
        System.out.println("В корзине лежит: " + conditionalOperator.checkingBasket(text2));
        in.close();

        //Дано название месяца прописью, вывести его порядковый номер. 
        //Если в названии месяца есть ошибка, то вывести "Ошибка". 
        //Регистр букв и наличие пробелов в начале или конце не должны влиять на работу программы.
        String text3 = "  МаРт  ";
        System.out.println("\nПорядковый номер месяца: " + switchCaseOperator.detectNumberMonth(text3));

        //Переменная содержит код языка. МОгут быть три варианта: "en", "ru", "fr". 
        //Вывести дни недели через запятую, на заданном языке, в зависимости от кода языка.
        String text4 = "ru";
        System.out.println("\nНазвания дней недели: " + switchCaseOperator.outputNamesOfDays(text4));

        //По номеру месяца определить количество дней в месяце.
        Integer month = 2;
        System.out.print("\nВ месяце номер " + month + " дней: " + switchCaseOperator.detectCountOfDay(month) + ".");

        //Создать массив символов из строки. Размер массива должен автоматически рассчитываться.
        //Вывести первый и последний элементы массива.
        String text5 = "Лед встал господа присяжные заседатели";
        ArraysOperators arraysOperators = new ArraysOperators();
        System.out.println(arraysOperators.countOfChars(text5));

        //Вывести одну цифру из середины целочисленного массива, если длинна массива не чётная, 
        //иначе вывести 2 числа из середины.
        int [] array1 = {5,5,8,7,9,3,7,2};
        System.out.println(arraysOperators.getDigitFromArrayMiddle(array1));

        //Дана переменная n. Вывести факториал n.
        int n = 0;
        CyclesOperators cyclesOperators = new CyclesOperators();
        System.out.println("\nФакториал числа n = " + cyclesOperators.calculateFactorial(n) + ".");

        //Даны две переменные: x, y. Вычислить x в степени y.
        int x = 3;
        int y = 3;
        System.out.println("\nx^y = " + cyclesOperators.degreeCalculator(x , y) + ".");
    }
}
