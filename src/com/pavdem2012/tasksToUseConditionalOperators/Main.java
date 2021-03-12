package com.pavdem2012.tasksToUseConditionalOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        //В переменной типа integer хранится число 2 или 3 или 4. 
        //Вывести сообщение"В переменной типа integer хранится " 
        //и число прописью.
        Integer number = 3;
        ConditionalOperator conditionalOperator = new ConditionalOperator();
        System.out.print("В переменной типа Integer хранится число " + conditionalOperator.detectNumber(number) + ".");

        //Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны."
        Integer a = 5;
        Integer b = 5;
        System.out.println("\n" + conditionalOperator.compareNumber(a, b));

        //Написать программу, которая делает заглавной первую
        //букву предложения(Если это необходимо),
        //ставит точку в конце предложения.  Строку взять любую 
        //из предыдущих, без точки.
        String text = "   перестань кричать ";
        System.out.println(conditionalOperator.firstToUpperCaseEndPoint(text));
        //Альтернативное решение

        System.out.println(conditionalOperator.firstToUpperCaseEndPointOther(text));
        //В корзине несколько яблок. Если одно яблоко то вывести "Яблоко одно",
        //Если яблок меньше трёх, то "Мало яблок", если яблок 3 или больше, то "Яблок хватит всем"
        String text1 = "В корзине 3 яблока";
        System.out.println(conditionalOperator.appleCounter(text1));

        //Если в строке описывающей коризну есть "яблоки" или "груши" или "апельсины" 
        //то вывести Фрукты. Если в строке описывающей корзину есть одновременно слова 
        //"специи" и "овощи" и "мясо", тогда вывести "суповой набор"
        Scanner in = new Scanner(System.in);
        System.out.print("В корзине видно: ");
        String text2 = in.nextLine();
        System.out.println("В корзине лежит: " + conditionalOperator.checkingBasket(text2));
        in.close();
    }
}
