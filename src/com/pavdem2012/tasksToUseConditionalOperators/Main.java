package com.pavdem2012.tasksToUseConditionalOperators;
public class Main {
    public static void main(String[] args) {
        //В переменной integer хранится число 2 или 3 или 4. Вывести сообщение 
        //"В переменной integer хранится " и число прописью.
        Integer number = 3;
        ConditionalOperator conditionalOperator = new ConditionalOperator();
        System.out.print("В переменной Integer хранится число " + conditionalOperator.detectNumber(number) + ".");

        //Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны."
        Integer a = 5;
        Integer b = 5;
        System.out.println("\n" + conditionalOperator.compareNumber(a, b));

        //Написать программу, которая делает заглавной первую букву предложения(Если это необходимо),
        //ставит точку в конце предложения.  Строку взять любую из предыдущих, без точки.
        String text = " перестань кричать ";
        System.out.println(conditionalOperator.firstToUpperCaseEndPoint(text));
    }
}
